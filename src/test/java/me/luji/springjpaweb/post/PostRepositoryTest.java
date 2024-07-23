package me.luji.springjpaweb.post;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void save() {
        Post post = new Post();
        post.setTitle("jpa");
        Post savedPost = postRepository.save(post);              // PERSIST

        assertThat(entityManager.contains(post)).isTrue();
        assertThat(entityManager.contains(savedPost)).isTrue();
        assertThat(savedPost == post).isTrue();

        Post postUpdate = new Post();
        postUpdate.setId(post.getId());
        postUpdate.setTitle("hibernate");
        postRepository.save(postUpdate);        // MERGE

        List<Post> all = postRepository.findAll();
        assertThat(all.size()).isEqualTo(1);

    }


    @Test
    public void findByTitleStartWidth() {
        Post post = new Post();
        post.setTitle("Spring Data Jpa");
        postRepository.save(post);              // PERSIST

        List<Post> all = postRepository.findByTitleStartingWith("Spring");
        assertThat(all.size()).isEqualTo(1);
    }

    @Test
    void findByTitle() {
        Post post = new Post();
        post.setTitle("Spring");
        postRepository.save(post);              // PERSIST

        List<Post> all = postRepository.findByTitle("Spring");
        assertThat(all.size()).isEqualTo(1);
    }
}
