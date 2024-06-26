package marinalucentini.backend_w6_d3.author.controllers;

import marinalucentini.backend_w6_d3.author.entities.Author;
import marinalucentini.backend_w6_d3.author.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
    @GetMapping
    public Page<Author> getAllUsers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, @RequestParam(defaultValue = "name") String sortBy) {
        return authorServices.getAuthors(page, size, sortBy);
    }
@GetMapping ("/{authorId}")
    public Author findById(@PathVariable UUID authorId){
        return authorServices.findById(authorId);
}
@PutMapping("/{authorId}")
    public Author findByIdAndUpdate (@PathVariable UUID authorId, @RequestBody Author authorModificated){
        return authorServices.findByIdAndUpdate(authorId, authorModificated);
}
}
