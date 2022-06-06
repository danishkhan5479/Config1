package com.ecommerce.terrapay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.terrapay.entity.Product;
import com.ecommerce.terrapay.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;
	@PostMapping("/product")
	public Product saveProductDetails(@RequestBody Product product) {
		return productservice.productservice(product);
	}
	

}
