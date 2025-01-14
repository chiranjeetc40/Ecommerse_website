package com.wiley.cartmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.wiley.cartmicroservice.entity.Vendor;
import com.wiley.cartmicroservice.feign.VendorClient;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorClient vendorClient;
	
	@Override
	public Vendor getVendorById(Integer vendorId) {
		log.info("request for get vendor details by VendorId received");
		Vendor vendor = vendorClient.getVendorDetails(vendorId);
		//Vendor vendor= restTemplate.getForObject("http://VENDOR-SERVICE/vendor/getVendorDetails/"+vendorId, Vendor.class);
		log.info("request vendor find by vendorId executed successfully");
		return vendor;
	}

	@Override
	public Vendor getVendorDetails(Integer productId, Integer quantity) {
		log.info("request for get vendor details by productId and quantity received");
		Vendor vendor = vendorClient.getBestVendor(productId, quantity);
		//Vendor vendor = restTemplate.getForObject("http://VENDOR-SERVICE/vendor/getBestVendor/" + productId + "/" + quantity,Vendor.class);
		log.info("request vendore find by productId and quantithy executed successfully");
		return vendor;
	}

}
