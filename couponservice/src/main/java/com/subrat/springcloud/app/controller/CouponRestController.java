package com.subrat.springcloud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrat.springcloud.app.model.Coupon;
import com.subrat.springcloud.app.service.CouponService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/coupons")
public class CouponRestController {

	@Autowired
	private CouponService couponService;
	
	@GetMapping("/test")
	public String test() {
		return "Test Successful";
	}

	@PostMapping
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		log.info("Inside createCoupon");
		return couponService.createCoupon(coupon);
	}

	@GetMapping
	public List<Coupon> getAllCoupons() {
		return couponService.getAllCoupons();
	}

	@GetMapping("{id}")
	public Coupon getCouponById(@PathVariable("id") Long id) {
		return couponService.getCouponById(id);
	}

	@GetMapping("code/{code}")
	public Coupon getCouponByCouponCode(@PathVariable("code") String code) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>> Server 2 <<<<<<<<<<<<<<<<<<<");
		return couponService.getCouponByCouponCode(code);
	}

	@PutMapping("{id}")
	public Coupon updateCoupon(@PathVariable("id") Long id, @RequestBody Coupon coupon) {
		return couponService.updateCoupon(id, coupon);
	}

	@DeleteMapping("{id}")
	public void deleteCoupon(@PathVariable("id") Long id) {
		couponService.deleteCoupon(id);
	}

}
