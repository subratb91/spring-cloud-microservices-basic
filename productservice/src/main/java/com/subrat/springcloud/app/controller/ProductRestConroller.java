package com.subrat.springcloud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrat.springcloud.app.model.Product;
import com.subrat.springcloud.app.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductRestConroller {

	@Autowired
	private ProductService productService;

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		return productService.getProductById(id);
	}

}
