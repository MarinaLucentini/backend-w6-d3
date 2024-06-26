package marinalucentini.backend_w6_d3.author.controllers;

import marinalucentini.backend_w6_d3.author.entities.Author;
import marinalucentini.backend_w6_d3.author.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorServices authorServices;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author saveAuthor(@RequestBody Author newAuthor){
        return authorServices.saveAuthor(newAuthor);
    }

}
