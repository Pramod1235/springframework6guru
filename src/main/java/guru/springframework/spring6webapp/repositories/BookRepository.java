package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Book;

/*
 * @Author Pramod Reddy
 */

public interface BookRepository extends CrudRepository<Book,Long>{

}
