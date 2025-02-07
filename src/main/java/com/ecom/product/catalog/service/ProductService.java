package com.ecom.product.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.product.catalog.model.Product;
import com.ecom.product.catalog.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		
		return productRepository.findAll();
	}
	
	public List<Product> getProductByCategory(Long categoryId){
		
		return productRepository.findByCategoryId(categoryId);
	}
}
