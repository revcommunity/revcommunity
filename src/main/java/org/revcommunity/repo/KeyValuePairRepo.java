package org.revcommunity.repo;

import org.revcommunity.model.KeyValuePair;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface KeyValuePairRepo extends GraphRepository<KeyValuePair> {

	@Query("START kvp=node:__types__(className='org.revcommunity.model.KeyValuePair') WHERE kvp.key = {0} RETURN kvp LIMIT 1")
	KeyValuePair findOneByKey(String key);
}
