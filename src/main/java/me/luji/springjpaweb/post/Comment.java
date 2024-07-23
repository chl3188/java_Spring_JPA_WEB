package me.luji.springjpaweb.post;

import jakarta.persistence.*;

//@NamedEntityGraph(name = "Comment.post", attributeNodes = @NamedAttributeNode("post"))
@Entity
public class Comment {
    @Id @GeneratedValue
    private long id;

    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
