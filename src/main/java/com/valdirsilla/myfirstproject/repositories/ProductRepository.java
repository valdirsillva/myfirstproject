package com.valdirsilla.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.valdirsilla.myfirstproject.entities.Product;

@Component
public class ProductRepository {
	/**
	 * coleção de chave e valores, similar ao dicionario do python
	 * criando uma instancia
	 */
	private Map<Long, Product> map = new HashMap<>();
	
	
	/**
	 * Metodo para salvar uma categoria
	 * @param obj
	 */
	public void save(Product obj) {
		
		map.put(obj.getId(), obj);
	}
    
	/**
	 * Metodo para retornar uma categoria por id
	 * @param obj
	 */
	public Product findById(Long id) {
		return map.get(id);
	}
	
	/**
	 * Metodo para retornar uma lista de categoria
	 * @param obj
	 */
	public List<Product> findAll() {
		/**
		 * Pega todos os valores e cria uma instancia com esses valores
		 */
		return new ArrayList<Product>(map.values());
	}
}
