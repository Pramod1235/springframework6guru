package guru.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring6webapp.repositories.AuthorRepository;

/*
 * @Author Pramod Reddy
 */

@Controller
public class AuthorController {
	
	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors" ,authorRepository.findAll());
		return "authors";
	}
	
	

}
