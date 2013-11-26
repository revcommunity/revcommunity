package org.revcommunity.service.internal;

import org.revcommunity.model.Product;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.subscription.ProductChannelRepo;
import org.revcommunity.service.ProductService;
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

    public Product createProduct( Product product )
    {
        pr.save( product );
        ProductChannel pc = new ProductChannel();
        pc.setChannelProduct( product );
        pcr.save( pc );
        return product;
    }

}
