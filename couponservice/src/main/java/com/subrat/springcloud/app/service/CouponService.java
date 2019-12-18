package com.subrat.springcloud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.springcloud.app.model.Coupon;
import com.subrat.springcloud.app.repository.CouponRepository;

@Service
public class CouponService {

	@Autowired
	private CouponRepository couponRepository;

	public Coupon createCoupon(Coupon coupon) {
		return couponRepository.save(coupon);
	}

	public List<Coupon> getAllCoupons() {
		return couponRepository.findAll();
	}

	public Coupon getCouponById(Long id) {
		return couponRepository.findById(id).get();
	}

	public Coupon updateCoupon(Long id, Coupon coupon) {
		coupon.setId(id);
		return couponRepository.save(coupon);
	}

	public void deleteCoupon(Long id) {
		couponRepository.deleteById(id);
	}

	public Coupon getCouponByCouponCode(String code) {
		return couponRepository.findByCode(code);
	}

}
