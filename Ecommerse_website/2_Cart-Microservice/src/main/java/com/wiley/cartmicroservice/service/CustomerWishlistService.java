package com.wiley.cartmicroservice.service;

import java.util.List;

import com.wiley.cartmicroservice.dto.CustomerWishlistDTO;
import com.wiley.cartmicroservice.dto.CustomerWishlistRequestDTO;
import com.wiley.cartmicroservice.dto.StatusDTO;
import com.wiley.cartmicroservice.entity.CustomerWishlist;

public interface CustomerWishlistService {

	void saveCustomerWishlist(CustomerWishlist customerWishlist);

	CustomerWishlist existsCustomerWishlist(Integer customerId, Integer productId);

	List<CustomerWishlist> getCustomerWishlistById(Integer customerId);

	StatusDTO addToCustomerWishList(CustomerWishlistRequestDTO customerWishlistRequestDTO);

	List<CustomerWishlistDTO> getAllWishlist(Integer customerId);

}