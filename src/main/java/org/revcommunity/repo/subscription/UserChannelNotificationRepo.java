package org.revcommunity.repo.subscription;

import org.revcommunity.model.subscription.UserChannelNotification;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserChannelNotificationRepo
    extends GraphRepository<UserChannelNotification>
{
}
