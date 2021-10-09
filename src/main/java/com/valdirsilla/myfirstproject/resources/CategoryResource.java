package com.valdirsilla.myfirstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdirsilla.myfirstproject.entities.Category;
import com.valdirsilla.myfirstproject.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> list = categoryRepository.findAll();
       
		return ResponseEntity.ok().body(list);
	}
    
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		/**
		 * Annotation @pathVariable reconhece o id passado por parâmetro
		 */
		
		Category cat = categoryRepository.findById(id);
		
		return ResponseEntity.ok().body(cat);
	}
	

}
