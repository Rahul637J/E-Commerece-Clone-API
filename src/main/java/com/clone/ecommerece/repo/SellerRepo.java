package com.clone.ecommerece.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.ecommerece.entity.Seller;

public interface SellerRepo extends JpaRepository<Seller, Integer>{
	
}
