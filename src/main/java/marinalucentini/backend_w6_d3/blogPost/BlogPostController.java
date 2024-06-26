package marinalucentini.backend_w6_d3.blogPost;

import marinalucentini.backend_w6_d3.author.entities.Author;
import marinalucentini.backend_w6_d3.blogPost.entities.BlogPost;
import marinalucentini.backend_w6_d3.blogPost.entities.BlogPostPayload;
import marinalucentini.backend_w6_d3.blogPost.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {
    @Autowired
    BlogPostService blogPostService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost saveBlogPost(@RequestBody BlogPostPayload blogPost){
        return blogPostService.saveBlogPost(blogPost);
    }
}
