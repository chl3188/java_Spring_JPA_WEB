package me.luji.springjpaweb.post;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentRepository  extends JpaRepository<Comment, Long>, QueryByExampleExecutor<Comment> {
    @EntityGraph(attributePaths = "post")
    Comment getById(Long id);

    @Transactional(readOnly = true)
    <T> List<T> findByPost_Id(Long id, Class<T> type);
}
