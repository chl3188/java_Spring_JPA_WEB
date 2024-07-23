package me.luji.springjpaweb.post;

import jakarta.persistence.*;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.Date;

@Entity
@NamedQuery(name = "Post.findByTitle", query = "SELECT p From Post p where p.title = ?1")
public class Post extends AbstractAggregateRoot<Post> {

    @Id @GeneratedValue
    private long id;

    private String title;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
