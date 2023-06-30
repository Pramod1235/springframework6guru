package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

/*
 * @Author Pramod Reddy
 */

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
