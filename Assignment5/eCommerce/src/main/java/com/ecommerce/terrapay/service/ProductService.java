package com.ecommerce.terrapay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.terrapay.entity.Product;
import com.ecommerce.terrapay.repository.ProductRepository;

@Service
public class ProductService {
      
	@Autowired
	private ProductRepository repo;
	public Product productservice(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

}
