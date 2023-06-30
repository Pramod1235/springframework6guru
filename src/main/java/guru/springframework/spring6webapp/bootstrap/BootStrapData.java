package guru.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;

/*
 * @Author Pramod Reddy
 */

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		
		Author eric = new Author();
		eric.setFirstName("Eric");
		eric.setLastName("Evans");
		
		Book mindfullness = new Book();
		mindfullness.setTitle("Mindfullness for dummies");
		mindfullness.setIsbn("123456");
		
		
		Author ericSaved = authorRepository.save(eric);
		Book mindfullnessSaved = bookRepository.save(mindfullness);
		
		Author rod = new Author();
		rod.setFirstName("Rod");
		rod.setLastName("JohnSon");
		
		Book noEJB = new Book();
		noEJB.setTitle("J2EE Development without EJB");
		noEJB.setIsbn("54757585");
		
		Author rodSaved = authorRepository.save(rod);
		Book noEJBSaved = bookRepository.save(noEJB);
		
		ericSaved.getBooks().add(mindfullnessSaved);
		rodSaved.getBooks().add(noEJBSaved);
		mindfullnessSaved.getAuthors().add(ericSaved);
		noEJBSaved.getAuthors().add(rodSaved);
		
		
		Publisher publisher = new Publisher();
		publisher.setPublisherName("Pramod Enterprise");
		publisher.setAddress("123 Main");
		publisher.setCity("Hyderabad");
		publisher.setState("Telagana");
		publisher.setZipCode("500062");
		
		Publisher publisherSaved = publisherRepository.save(publisher);
		
		mindfullnessSaved.setPublisher(publisherSaved);
		noEJB.setPublisher(publisherSaved);
		
		authorRepository.save(eric);
		bookRepository.save(mindfullness);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
		
		System.out.println("In BootStrap");
		System.out.println("Author Count " + authorRepository.count());
		System.out.println("Book Count " + bookRepository.count());
		System.out.println("Publisher Count " + publisherRepository.count() );
		
	}

}
