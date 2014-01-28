package org.revcommunity.repo;

import java.util.List;

import org.revcommunity.model.Comment;
import org.revcommunity.model.Product;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface CommentRepo
    extends GraphRepository<Comment>
{
    /**
     * 
     * Metoda zwraca komentarze oznaczone jakos spam
     *
     * @return
     * @author Tomek Straszewski Jan 28, 2014
     */
    @Query("START c=node:__types__(className='org.revcommunity.model.Comment') WHERE c.spamCount > 0 RETURN c") 
    List<Comment> findCommentMarkedAsSpam();
}
