package com.cognizant.vendormicroservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.yash.vendormicroservice.Repository.VendorRepository;
import com.yash.vendormicroservice.dto.VendorDTO;
import com.yash.vendormicroservice.entity.Vendor;
import com.yash.vendormicroservice.exception.VendorNotFoundException;
import com.yash.vendormicroservice.service.VendorServiceImpl;

@SpringBootTest
public class VendorServiceImplTest {
	
	@Autowired
	VendorServiceImpl vendorServiceImpl;

	@MockBean
	VendorRepository vendorRepository;

	@Test
	void testFindByVendorId() {
		Optional<Vendor> vendor = Optional.of(new Vendor(1, "Amazon", 30.5, (float)5.0));
		Integer vendorId = 1;
		when(vendorRepository.findById(vendorId)).thenReturn(vendor);
		assertEquals(vendorServiceImpl.getVendorDetailsById(vendorId).getVendorId(), vendor.get().getVendorId());
	}

	@Test
	void testFindByVendorIdVendorNotFoundException() {
		Integer vendorId = 101;
		when(vendorRepository.findById(vendorId)).thenReturn(Optional.empty());
		Exception exception = assertThrows(VendorNotFoundException.class, () -> vendorServiceImpl.getVendorDetailsById(vendorId));
		assertEquals("Vendor With id [" + vendorId + "] not found", exception.getMessage());
	}

}
