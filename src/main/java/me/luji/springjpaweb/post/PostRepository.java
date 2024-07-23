package me.luji.springjpaweb.post;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleStartingWith(String title);

    @Query("SELECT p From #{#entityName} p where p.title = :title")
    List<Post> findByTitle(@Param("title") String title, Sort sort);

    @Modifying(clearAutomatically = true)
    @Query("Update Post p Set p.title = ?1 where p.id = ?2")
    int updateTitle(String title, Long id);
}
