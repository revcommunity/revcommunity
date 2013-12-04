package org.revcommunity.service.internal;

import java.util.Date;

import org.revcommunity.model.Product;
import org.revcommunity.model.User;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.service.ProductService;
import org.revcommunity.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl
    implements ProductService
{
    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductChannelRepo pcr;

    @Autowired
    private UserRepo ur;

    public Product createProduct( Product product )
    {
        product.buildProperites();
        product.setDateAdded( new Date() );
        pr.save( product );
        ProductChannel pc = new ProductChannel();
        pc.setChannelProduct( product );
        pcr.save( pc );
        return product;
    }

    public void updateProduct( Product product )
    {
        product.buildProperites();
        String userName = SessionUtils.getLoggedUserName();
        User modificationUser = ur.findByUserName( userName );
        product.setLastEditUser( modificationUser );
        product.setLastModification( new Date() );
        pr.save( product );
    }

}
