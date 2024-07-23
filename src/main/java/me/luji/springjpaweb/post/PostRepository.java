package me.luji.springjpaweb.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleStartingWith(String title);

    @Query("SELECT p From Post p where p.title = ?1")
    List<Post> findByTitle(String title);
}
