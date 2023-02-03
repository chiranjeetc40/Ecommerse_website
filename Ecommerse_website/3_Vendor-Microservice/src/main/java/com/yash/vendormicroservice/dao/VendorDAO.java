package com.yash.vendormicroservice.dao;

import com.yash.vendormicroservice.entity.Vendor;

public interface VendorDAO {

	Vendor getVendorDetailsByIdDao(Integer vendorId);

}