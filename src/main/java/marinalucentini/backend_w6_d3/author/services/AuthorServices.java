package marinalucentini.backend_w6_d3.author.services;

import marinalucentini.backend_w6_d3.author.entities.Author;
import marinalucentini.backend_w6_d3.author.exceptions.BadRequestException;
import marinalucentini.backend_w6_d3.author.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuthorServices {
    @Autowired
    AuthorRepository authorRepository;
    public Author saveAuthor(Author newAuthor){
authorRepository.findByEmail(newAuthor.getEmail()).ifPresent(
        author -> {
            throw new BadRequestException("L'email " + newAuthor.getEmail() + " è già in uso!");
        }
);
newAuthor.setDateOfBirth(LocalDate.now().minusYears(22));
        System.out.println("L'autore è stato correttamente salvato nel db" + newAuthor.getName() + newAuthor.getDateOfBirth());
      return   authorRepository.save(newAuthor);
    }
}
