package org.revcommunity.dto;

import java.util.ArrayList;

import org.revcommunity.model.Product;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto
{

    private Product product;

    private ArrayList<MultipartFile> images;

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }

    public ArrayList<MultipartFile> getImages()
    {
        return images;
    }

    public void setImages( ArrayList<MultipartFile> images )
    {
        this.images = images;
    }

}
