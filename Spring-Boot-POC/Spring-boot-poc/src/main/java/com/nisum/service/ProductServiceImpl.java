/*package com.nisum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.model.Product;
import com.nisum.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
    private ProductRepository productRepository;
	



	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getById(String productId) {
		return productRepository.findOne(productId);
	}

	@Override
	public Product create(Product product) {
		
		productRepository.save(product);
		return product;
	}
	@Override
	public List<Product> saveAll(List<Product> product) {
		
		List<Product> allProducts = productRepository.save(product);
		return allProducts;
	}

	@Override
	public Product delete(String productId) {
	return	productRepository.findOne(productId);
	}

	@Override
	public Product updateProduct(String productId, Product product) {
	Product product2=	productRepository.findOne(productId);

	
	product2.setProductName(product.getProductName());
	product2.setProductPrice(product.getProductPrice());
	product2.setDescription(product.getDescription());
productRepository.save(product2);
		return product2;
	}
	
}
*/