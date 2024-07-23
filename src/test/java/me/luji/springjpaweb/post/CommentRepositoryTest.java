package me.luji.springjpaweb.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void getComment() {
//        Post post = new Post();
//        post.setTitle("jpa");
//
//        Comment comment = new Comment();
//        comment.setComment("comment");
//        comment.setPost(post);

        commentRepository.getById(1l);

        System.out.println("============================");

        commentRepository.findById(1l);
    }
}