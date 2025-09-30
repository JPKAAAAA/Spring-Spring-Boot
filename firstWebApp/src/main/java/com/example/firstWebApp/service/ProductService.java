package com.example.firstWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.firstWebApp.model.Product;

@Service
public class ProductService {
	List<Product> lst=new ArrayList<Product>(Arrays.asList(new Product(124142,"I Phone 17",130000.0),
			new Product(124143,"Acer Aspire 7",70000.0),
			new Product(124144,"Samsung Android TV",40000.0)));
	
	public List<Product> getProduct() {
		return lst;
	}
	
	public Product getProductById(int id) {
		for(Product p:lst)
		{
			if(p.getProdId()==id)
				return p;
		}
		return new Product();
	}

	public Boolean addProduct(Product product) {
		System.out.println(lst.size());
		Boolean res=lst.add(product);
		System.out.println(product);
		System.out.println(lst.size());
		return res;
	}

	public boolean updateProductByID(Product product) {
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getProdId()==product.getProdId())
			{
				lst.set(i, product);
				System.out.println(product);
				return true;
			}
		}
		return false;
	}

	public boolean deleteProductByID(Product product) {
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getProdId()==product.getProdId())
			{
				return lst.remove(lst.get(i));
				
			}
		}
		return false;
	}
	
	public boolean deleteProduct(int prodID) {
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getProdId()==prodID)
			{
				return lst.remove(lst.get(i));
				
			}
		}
		return false;
	}
}
