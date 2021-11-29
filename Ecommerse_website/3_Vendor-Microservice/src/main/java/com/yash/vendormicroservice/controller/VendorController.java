package com.yash.vendormicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.vendormicroservice.dto.VendorDTO;
import com.yash.vendormicroservice.exception.ProductIdNotFoundException;
import com.yash.vendormicroservice.exception.QuantityLimitExceededException;
import com.yash.vendormicroservice.service.VendorService;
import com.yash.vendormicroservice.service.VendorStockService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value={"/vendor"})
public class VendorController {	
	
	@Autowired
	private VendorService vendorServiceImpl;
	
	@Autowired
	private VendorStockService vendorStockServiceImpl;
	
	
	@GetMapping(value={"/getVendorDetails/{vendorId}"})
	public VendorDTO getVendorDetails(@PathVariable Integer vendorId) {
		log.info("Get Vendor Details from Controller method");
		return vendorServiceImpl.getVendorDetailsById(vendorId); 
	}
	
	@GetMapping(value= {"/getBestVendor/{productId}/{quantity}"})
	public VendorDTO getBestVendor(@PathVariable Integer productId, @PathVariable Integer quantity) 
			throws ProductIdNotFoundException, QuantityLimitExceededException {
		log.info("Get Best Vendor Details from Controller method");
		return vendorStockServiceImpl.getBestVendor(productId,quantity);

	}

}
