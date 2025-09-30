package com.example.secondWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.secondWebApp.model.Product;
import com.example.secondWebApp.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getProduct() {
		return repo.findAll();
	}
	
	public Product getProductById(int id) {
		return repo.findById(id).orElse(new Product());
	}

	public void addProduct(Product product) {
		repo.save(product)
		;
	}

	public void updateProductByID(Product product) {
		repo.save(product);
	}

	public void deleteProduct(Product product) {
		repo.delete(product);
	}
	
	public void deleteProductByID(int prodID) {
		repo.deleteById(prodID);
	}
}
