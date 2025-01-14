package com.yash.vendormicroservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.vendormicroservice.dao.VendorDAO;
import com.yash.vendormicroservice.dto.VendorDTO;
import com.yash.vendormicroservice.entity.Vendor;
import com.yash.vendormicroservice.exception.VendorNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDAO vendorDAOImpl;
	@Override
	public VendorDTO getVendorDetailsById(Integer vendorId) throws VendorNotFoundException {
		log.info("Get Vendor Details from Vendor Service Method");
		Vendor entity = vendorDAOImpl.getVendorDetailsByIdDao(vendorId);
		System.out.println(entity);
		if(entity!=null) {
			VendorDTO dto = new VendorDTO();
			ModelMapper mapper = new ModelMapper();
			mapper.map(entity,dto);
			return dto;
		}
		else {
			throw new VendorNotFoundException("Vendor With id [" + vendorId + "] not found");
		}
		
	}

}
