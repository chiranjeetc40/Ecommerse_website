package com.yash.vendormicroservice.dao;

import java.util.List;

import com.yash.vendormicroservice.entity.Vendor;
import com.yash.vendormicroservice.entity.VendorStock;

public interface VendorStockDAO {

	Vendor getBestVendorDao(Integer productId, Integer quantity);

	void saveVendorDetailsDao(VendorStock vendorStock);

	int getMaxStockCountDao(Integer productId);

	List<Integer> getvendorIdsForGivenProductDao(Integer productId);

	List<Integer> getvendorIdsWithAvailableQuantityDao(Integer productId, int quantity);

	VendorStock getVendorStockDetailsDao(Integer productId, Integer vendorId);

}