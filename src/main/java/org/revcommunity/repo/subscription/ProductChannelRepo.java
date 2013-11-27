package org.revcommunity.repo.subscription;

import java.util.List;

import org.revcommunity.model.Product;
import org.revcommunity.model.subscription.ProductChannel;
import org.revcommunity.model.subscription.ProductSubscription;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ProductChannelRepo
    extends GraphRepository<ProductChannel>
{
    public ProductChannel findByChannelProduct( Product product );

    @Query( "START channel=node({0}) MATCH channel<-[:SUBSCRIBE_PRODUCT]->observers RETURN observers" )
    public List<ProductSubscription> getAllObservers( ProductChannel channel );
}
