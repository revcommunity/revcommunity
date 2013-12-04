package org.revcommunity.service;

import org.revcommunity.model.Product;

public interface ProductService
{

    public Product createProduct( Product product );

    public void updateProduct( Product product );
}
