package org.getmygithub.webapp.service;

import java.util.List;
import java.util.Optional;

import org.getmygithub.webapp.model.Product;

public interface ProductService {
	Product save(Product product);

	Product update(Product product);

	void deleteById(Long id);

	Optional<Product> findById(Long id);

	List<Product> findAll();
}
