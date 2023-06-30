package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

/*
 * @Author Pramod Reddy
 */
public interface BookService {
	
	Iterable<Book> findAll();

}
