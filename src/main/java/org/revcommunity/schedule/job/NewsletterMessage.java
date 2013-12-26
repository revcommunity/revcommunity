package org.revcommunity.schedule.job;

import java.util.List;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;

/**
 * @author Marcin Kaźmierski
 */
public interface NewsletterMessage
{
    public String createMessage( List<Product> products, List<Review> reviews, String serverUrl );
}
