package marinalucentini.backend_w6_d3.blogPost.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class BlogPostPayload {
    private String cathegory;
    private String title;
    private String body;
    private int readingTime;
    private UUID authorId;
}
