package com.yash.vendormicroservice.service;

import java.util.List;

import com.yash.vendormicroservice.dto.VendorDTO;
import com.yash.vendormicroservice.entity.VendorStock;
import com.yash.vendormicroservice.exception.ProductIdNotFoundException;
import com.yash.vendormicroservice.exception.QuantityLimitExceededException;

public interface VendorStockService {

	void saveVendorDetails(VendorStock vendorStock);

	int getMaxStockCount(Integer productId);

	List<Integer> getvendorIdsForGivenProduct(Integer productId);

	List<Integer> getvendorIdsWithAvailableQuantity(Integer productId, int quantity);

	VendorStock getVendorStockDetails(Integer productId, Integer vendorId);

	VendorDTO getBestVendor(Integer productId, Integer quantity)
			throws ProductIdNotFoundException, QuantityLimitExceededException;

}