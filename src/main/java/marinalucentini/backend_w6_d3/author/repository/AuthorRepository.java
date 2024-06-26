package marinalucentini.backend_w6_d3.author.repository;

import marinalucentini.backend_w6_d3.author.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
