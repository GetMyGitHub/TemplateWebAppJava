package org.getmygithub.webapp.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.getmygithub.webapp.model.Product;
import org.getmygithub.webapp.repository.ProductRepository;;

public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Inject
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product update(Product product) {
		return productRepository.update(product);
	}

}
