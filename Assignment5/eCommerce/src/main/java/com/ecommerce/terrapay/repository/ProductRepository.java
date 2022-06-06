package com.ecommerce.terrapay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.terrapay.entity.Product;

public interface ProductRepository extends JpaRepository<Product,String>{

}
