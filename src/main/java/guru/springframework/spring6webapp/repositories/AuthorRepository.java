package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * @Author Pramod Reddy
 */

import guru.springframework.spring6webapp.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
