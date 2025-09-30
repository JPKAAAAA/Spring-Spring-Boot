package com.example.secondWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.secondWebApp.model.Product;
import com.example.secondWebApp.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@RequestMapping("/products")
	public List<Product> getProduct() {
		return ps.getProduct();
	}
	
	@GetMapping("/products/{prodID}")
	public Product getProductByID(@PathVariable int prodID) {
		return ps.getProductById(prodID);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		ps.addProduct(product);
	}
	
	@PutMapping("/products")
	public void updateProductByID(@RequestBody Product product) {
		ps.updateProductByID(product);
	}
	
	@DeleteMapping("/products")
	public void deleteProductByID(@RequestBody Product product) {
		ps.deleteProduct(product);
	}
	
	@DeleteMapping("/products/{prodID}")
	public void deleteProduct(@PathVariable int prodID) {
		ps.deleteProductByID(prodID);
	}
}
