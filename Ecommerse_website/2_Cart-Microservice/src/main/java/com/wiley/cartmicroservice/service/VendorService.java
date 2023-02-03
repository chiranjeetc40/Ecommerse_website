package com.wiley.cartmicroservice.service;

import com.wiley.cartmicroservice.entity.Vendor;

public interface VendorService {

	Vendor getVendorById(Integer vendorId);

	Vendor getVendorDetails(Integer productId, Integer quantity);

}