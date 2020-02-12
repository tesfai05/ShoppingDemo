package edu.miu.OnlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.OnlineShopping.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
