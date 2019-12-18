package com.subrat.springcloud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.springcloud.app.dto.Coupon;
import com.subrat.springcloud.app.model.Product;
import com.subrat.springcloud.app.repository.ProductRepository;
import com.subrat.springcloud.app.restclient.CouponClient;

@Service
public class ProductService {

	@Autowired
	private CouponClient couponFeignClient;

	@Autowired
	private ProductRepository productRepository;

	public Product createProduct(Product product) {
		Coupon coupon = couponFeignClient.getCouponByCouponCode(product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return productRepository.save(product);
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id).get();
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

}
