package marinalucentini.backend_w6_d3.blogPost.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import marinalucentini.backend_w6_d3.author.entities.Author;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlogPost {
    @Id
    @GeneratedValue
    private UUID id;
    private String cathegory;
    private String title;
    private String cover;
    private String body;
    private LocalTime readingTime;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    Author author;

    public BlogPost(String cathegory, String title, String body) {
        this.cathegory = cathegory;
        this.title = title;
        this.body = body;

    }
}
