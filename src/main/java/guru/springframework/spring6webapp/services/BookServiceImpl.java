package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;

/*
 * @Author Pramod Reddy
 */

@Service
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
