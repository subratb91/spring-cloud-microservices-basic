package com.subrat.springcloud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.springcloud.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
