package com.wiley.cartmicroservice.dao;

import java.util.List;

import com.wiley.cartmicroservice.entity.CustomerWishlist;

public interface CustomerWishlistDAO {

	void saveCustomerWishlistDao(CustomerWishlist customerWishlist);

	CustomerWishlist existsCustomerWishlistDao(Integer customerId, Integer productId);

	List<CustomerWishlist> getCustomerWishlistByIdDao(Integer customerId);

}