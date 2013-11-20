package org.revcommunity.repo.subscription;

import org.revcommunity.model.subscription.UserNotification;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserNotificationRepo
    extends GraphRepository<UserNotification>
{
}
