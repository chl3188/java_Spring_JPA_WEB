package me.luji.springjpaweb.post;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {

//    @EntityGraph(value = "Comment.post", type = EntityGraph.EntityGraphType.LOAD)
//    Comment getById(Long id);

    @EntityGraph(attributePaths = "post")
    Comment getById(Long id);
}
