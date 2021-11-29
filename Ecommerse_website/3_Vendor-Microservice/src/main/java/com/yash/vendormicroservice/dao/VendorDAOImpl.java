package com.yash.vendormicroservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.vendormicroservice.Repository.VendorRepository;
import com.yash.vendormicroservice.entity.Vendor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class VendorDAOImpl implements VendorDAO {
	
	@Autowired
	private VendorRepository vendorRepository;
	@Override
	public Vendor getVendorDetailsByIdDao(Integer vendorId) {
		log.info("Get Vendor details from Vendor DAO method");
		Vendor dao = vendorRepository.findById(vendorId).orElse(null);
		return dao;
		
	}

}
