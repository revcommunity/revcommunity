package org.revcommunity.remote.service.allegro;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.util.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.allegro.webapi.service_php.CatInfoType;
import pl.allegro.webapi.service_php.CategoryData;
import pl.allegro.webapi.service_php.DoGetCategoryPathRequest;
import pl.allegro.webapi.service_php.DoGetCategoryPathResponse;
import pl.allegro.webapi.service_php.DoGetCatsDataRequest;
import pl.allegro.webapi.service_php.DoGetCatsDataResponse;
import pl.allegro.webapi.service_php.DoGetSellFormAttribsRequest;
import pl.allegro.webapi.service_php.DoGetSellFormAttribsResponse;
import pl.allegro.webapi.service_php.DoLoginRequest;
import pl.allegro.webapi.service_php.DoLoginResponse;
import pl.allegro.webapi.service_php.DoShowCatRequest;
import pl.allegro.webapi.service_php.DoShowCatResponse;
import pl.allegro.webapi.service_php.InfoCatList;
import pl.allegro.webapi.service_php.SellFormType;
import pl.allegro.webapi.service_php.ServicePort;
import pl.allegro.webapi.service_php.ServiceServiceLocator;

/**
 * @author Tomek Straszewski Nov 17, 2013
 */
@Service( "AllegroService" )
public class AllegroService
    implements RemoteService
{

    private static final Logger logger = Logger.getLogger( AllegroService.class );

    @Autowired
    private AbstractCategoryRepo abstractCategoryRepo;

    public ServicePort service = null;

    public AllegroService()
    {
        try
        {
            service = new ServiceServiceLocator().getservicePort();
        }
        catch ( ServiceException e )
        {
            e.printStackTrace();
        }
    }

    @Transactional
    public void downloadAllCategories()
    {
        try
        {
            List<CategoryGroup> cats = downloadMainCategories();

            for ( CategoryGroup cat : cats )
            {
                List<AbstractCategory> list = downloadCategoriesByParentId( cat.getRemoteId() );
                for ( AbstractCategory abstractCategory : list )
                {
                    cat.addChild( abstractCategory );
                }

                this.abstractCategoryRepo.save( cat );
            }
        }
        catch ( Exception ex )
        {
            ex.printStackTrace();
        }
    }

    @Transactional
    public List<AbstractCategory> downloadCategoriesByParentId( Long parentId )
    {

        List<AbstractCategory> categoriesToReturn = new ArrayList<AbstractCategory>();

        DoShowCatRequest cr = new DoShowCatRequest();
        cr.setCatId( parentId.intValue() );
        cr.setSessionHandle( sessionId );
        cr.setCatItemsLimit( 1 );

        try
        {
            DoShowCatResponse catResponse = service.doShowCat( cr );

            InfoCatList[] categories = catResponse.getCatChildArray();

            int length = categories.length;
            if ( length == 0 )
            {
                if ( logger.isDebugEnabled() )
                {
                    logger.debug( "Category : " + parentId + " is leaf" );
                }
                return categoriesToReturn;
            }

            boolean exist = false;
            // FIXME
            if ( length > 3 )
                length = 3;
            for ( int i = 0; i < length; i++ )
            {

                exist = false;
                InfoCatList catInfo = categories[i];
                try
                {
                    // tutaj pobieramy szczegoly
                    // oraz informacjee o tym czy np jest lisciem

                    long categoryId = catInfo.getCatId();

                    AbstractCategory category = null;

                    if ( ( category = this.abstractCategoryRepo.findByRemoteId( new Long( categoryId ) ) ) != null )
                    {
                        if ( logger.isDebugEnabled() )
                        {
                            logger.debug( "Category already exist : " + catInfo.toString() );
                        }
                        exist = true;
                    }

                    DoGetSellFormAttribsRequest ar =
                        new DoGetSellFormAttribsRequest( AllegroConstans.COUNTRY_ID, AllegroConstans.WEB_API_KEY, AllegroConstans.LOCAL_VERSION,
                                                         (int) categoryId );
                    DoGetSellFormAttribsResponse categoryDetail = service.doGetSellFormAttribs( ar );
                    SellFormType[] sellFormTypes = categoryDetail.getSellFormFields();

                    if ( !exist )
                    {
                        DoGetCategoryPathRequest cp = new DoGetCategoryPathRequest( this.sessionId, (int) categoryId );
                        DoGetCategoryPathResponse categoryPath = service.doGetCategoryPath( cp );

                        CategoryData[] categoriesData = categoryPath.getCategoryPath();

                        // interesuje nas ostatni element na liscie
                        int last = categoriesData.length - 1;
                        CategoryData categoryData = categoriesData[last];

                        CategoryGroup parent = (CategoryGroup) this.abstractCategoryRepo.findByRemoteId( parentId );

                        if ( categoryData.getCatIsLeaf() == AllegroConstans.LEAF )
                        {
                            category = AllegroConstans.CategoryCreator( new Category(), categoryData, sellFormTypes );
                        }
                        else
                        {
                            category = AllegroConstans.CategoryCreator( new CategoryGroup(), categoryData, sellFormTypes );
                        }

                        category.setParent( parent );

                        this.abstractCategoryRepo.save( category );

                        if ( logger.isDebugEnabled() )
                        {
                            logger.debug( "Category number : " + i + " saved : " + category.toString() );
                        }
                    }

                    List<AbstractCategory> childs = downloadCategoriesByParentId( category.getRemoteId() );
                    for ( AbstractCategory child : childs )
                    {
                        ( (CategoryGroup) category ).addChild( child );
                    }

                    if ( childs.size() > 0 )
                        this.abstractCategoryRepo.save( category );

                }
                catch ( RemoteException e )
                {

                    if ( e instanceof AxisFault )
                    {
                        AxisFault af = (AxisFault) e;
                        if ( logger.isDebugEnabled() )
                        {
                            logger.debug( "Exception code : " + af.getFaultCode() );
                        }

                        if ( af.getFaultCode().toString().equals( AllegroConstans.ERR_SESSION_EXPIRED ) )
                        {
                            // ticket wygasl, jest wazny tylko przez godzine
                            login();
                            i--;
                            continue;
                        }
                    }

                    e.printStackTrace();
                    break;
                }
            }
        }
        catch ( RemoteException e )
        {
            if ( logger.isDebugEnabled() )
            {
                if ( e instanceof AxisFault )
                {
                    AxisFault af = (AxisFault) e;
                    logger.debug( "Exception code : " + af.getFaultCode() );
                }
            }
        }

        return categoriesToReturn;
    }

    @Transactional
    public void downloadProductsByCategoryId( Category category, int limit )
    {
        // TODO Auto-generated method stub

    }

    public List<CategoryGroup> downloadMainCategories()
    {
        login();
        DoGetCatsDataRequest categoriesRequest =
            new DoGetCatsDataRequest( AllegroConstans.COUNTRY_ID, AllegroConstans.LOCAL_VERSION, AllegroConstans.WEB_API_KEY );
        List<CategoryGroup> mainCategories = new ArrayList<CategoryGroup>();
        try
        {
            DoGetCatsDataResponse categoriesResponse = service.doGetCatsData( categoriesRequest );

            CatInfoType[] categories = categoriesResponse.getCatsList();
            for ( CatInfoType catInfoType : categories )
            {
                if ( catInfoType.getCatParent() == 0 )
                {
                    int categoryId = catInfoType.getCatId();

                    if ( this.abstractCategoryRepo.findByRemoteId( new Long( categoryId ) ) == null )
                    {

                        CategoryGroup parent = null;

                        DoGetCategoryPathRequest cp = new DoGetCategoryPathRequest( this.sessionId, (int) categoryId );
                        DoGetCategoryPathResponse categoryPath = service.doGetCategoryPath( cp );

                        CategoryData[] categoriesData = categoryPath.getCategoryPath();

                        // interesuje nas ostatni element na liscie
                        int last = categoriesData.length - 1;
                        CategoryData categoryData = categoriesData[last];

                        DoGetSellFormAttribsRequest ar =
                            new DoGetSellFormAttribsRequest( AllegroConstans.COUNTRY_ID, AllegroConstans.WEB_API_KEY, AllegroConstans.LOCAL_VERSION,
                                                             (int) categoryId );
                        DoGetSellFormAttribsResponse categoryDetail = service.doGetSellFormAttribs( ar );
                        SellFormType[] sellFormTypes = categoryDetail.getSellFormFields();

                        CategoryGroup category = (CategoryGroup) AllegroConstans.CategoryCreator( new CategoryGroup(), categoryData, sellFormTypes );

                        mainCategories.add( category );

                        this.abstractCategoryRepo.save( category );

                        if ( logger.isDebugEnabled() )
                        {
                            logger.debug( "Category saved : " + category.toString() );
                        }

                    }
                    else
                    {
                        continue;
                    }
                }
                else
                {
                    continue;
                }
            }
        }
        catch ( RemoteException e )
        {
            if ( logger.isDebugEnabled() )
            {
                if ( e instanceof AxisFault )
                {
                    AxisFault af = (AxisFault) e;
                    logger.debug( "Exception code : " + af.getFaultCode() );
                }
            }
        }

        return mainCategories;
    }

    private String sessionId;

    private void login()
    {
        DoLoginRequest loginRequest =
            new DoLoginRequest( AllegroConstans.LOGIN, AllegroConstans.PASSWORD, AllegroConstans.COUNTRY_ID, AllegroConstans.WEB_API_KEY,
                                AllegroConstans.LOCAL_VERSION );

        try
        {
            DoLoginResponse loginResponse = service.doLogin( loginRequest );
            if ( logger.isDebugEnabled() )
            {
                logger.debug( loginResponse.getSessionHandlePart() );
            }
            this.sessionId = loginResponse.getSessionHandlePart();
        }
        catch ( RemoteException e )
        {
            if ( logger.isDebugEnabled() )
            {
                if ( e instanceof AxisFault )
                {
                    AxisFault af = (AxisFault) e;
                    logger.debug( "Exception code : " + af.getFaultCode() );
                }
            }

            e.printStackTrace();
        }
    }

}
