package org.revcommunity.repo;

import org.revcommunity.model.Comment;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CommentRepo
    extends GraphRepository<Comment>
{

}
