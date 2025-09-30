package com.example.firstWebApp.controller;

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

import com.example.firstWebApp.model.Product;
import com.example.firstWebApp.service.ProductService;

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
	public String addProduct(@RequestBody Product product) {
		if(ps.addProduct(product))
			return "Product Added";
		else
			return "Failed to Add Product";
	}
	
	@PutMapping("/products")
	public String updateProductByID(@RequestBody Product product) {
		if(ps.updateProductByID(product))
			return "Product Updated";
		else
			return "Failed to Update the product";
	}
	
	@DeleteMapping("/products")
	public String deleteProductByID(@RequestBody Product product) {
		if(ps.deleteProductByID(product))
			return "Product Deleted";
		else
			return "Failed to Delete the product";
	}
	
	@DeleteMapping("/products/{prodID}")
	public String deleteProduct(@PathVariable int prodID) {
		if(ps.deleteProduct(prodID))
			return "Product Deleted";
		else
			return "Failed to Delete the product";
	}
}
