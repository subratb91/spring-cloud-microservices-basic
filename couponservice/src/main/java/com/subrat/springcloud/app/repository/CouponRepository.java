package com.subrat.springcloud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.springcloud.app.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
