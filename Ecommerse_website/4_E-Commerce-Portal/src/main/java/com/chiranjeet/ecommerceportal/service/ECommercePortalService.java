package com.chiranjeet.ecommerceportal.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.client.HttpClientErrorException;

import com.chiranjeet.ecommerceportal.dto.CartRequestDTO;
import com.chiranjeet.ecommerceportal.dto.CartResponseDTO;
import com.chiranjeet.ecommerceportal.dto.CustomerWishlistDTO;
import com.chiranjeet.ecommerceportal.dto.CustomerWishlistRequestDTO;
import com.chiranjeet.ecommerceportal.dto.StatusDTO;
import com.chiranjeet.ecommerceportal.entity.JwtRequest;
import com.chiranjeet.ecommerceportal.entity.JwtResponse;
import com.chiranjeet.ecommerceportal.entity.Product;

public interface ECommercePortalService {

	JwtResponse authticate(JwtRequest authenticationRequest, HttpServletResponse response)
			throws HttpClientErrorException;

	List<Product> getAllProducts() throws HttpClientErrorException;

	List<Product> searchByName(String name);

	StatusDTO addToCart(CartRequestDTO request);

	List<CartResponseDTO> getCart() throws HttpClientErrorException;

	List<CustomerWishlistDTO> getWishlist();

	StatusDTO addToCustomerWishList(CustomerWishlistRequestDTO customerWishlist);

	Product setRating(int productId, int rating);

	void logout();

}