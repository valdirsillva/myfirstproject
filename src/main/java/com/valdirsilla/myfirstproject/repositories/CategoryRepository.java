package com.valdirsilla.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.valdirsilla.myfirstproject.entities.Category;

@Component
public class CategoryRepository {
	/**
	 * coleção de chave e valores, similar ao dicionario do python
	 * criando uma instancia
	 */
	private Map<Long, Category> map = new HashMap<>();
	
	
	/**
	 * Metodo para salvar uma categoria
	 * @param obj
	 */
	public void save(Category obj) {
		
		map.put(obj.getId(), obj);
	}
    
	/**
	 * Metodo para retornar uma categoria por id
	 * @param obj
	 */
	public Category findById(Long id) {
		return map.get(id);
	}
	
	/**
	 * Metodo para retornar uma lista de categoria
	 * @param obj
	 */
	public List<Category> findAll() {
		/**
		 * Pega todos os valores e cria uma instancia com esses valores
		 */
		return new ArrayList<Category>(map.values());
	}
}
