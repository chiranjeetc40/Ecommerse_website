package com.yash.vendormicroservice.service;

import com.yash.vendormicroservice.dto.VendorDTO;

public interface VendorService {

	VendorDTO getVendorDetailsById(Integer vendorId);

}