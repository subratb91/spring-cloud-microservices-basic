package com.subrat.springcloud.app.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.subrat.springcloud.app.dto.Coupon;

@FeignClient("zuul-api-gateway")  //Zuul automatically gives server side Load Balancing
//@RibbonClient("COUPON-SERVICE") //As Client side load balancing no longer required
public interface CouponClient {
	
	@GetMapping("/coupon-service/api/coupons/code/{code}")
	public Coupon getCouponByCouponCode(@PathVariable("code") String code);

}
