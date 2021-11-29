package com.wiley.cartmicroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wiley.cartmicroservice.entity.Product;



@FeignClient(value="PRODUCT-SERVICE",url = "http://localhost:5000/product")
public interface ProductClient {
	@GetMapping(value = { "/searchProductById/{id}" })
	public Product searchProductById(@PathVariable Integer id);
	
	

}
