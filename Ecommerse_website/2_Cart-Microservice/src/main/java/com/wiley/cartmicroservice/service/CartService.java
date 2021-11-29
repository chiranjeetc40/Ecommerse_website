package com.wiley.cartmicroservice.service;

import java.util.List;

import com.wiley.cartmicroservice.dto.CartDTO;
import com.wiley.cartmicroservice.dto.CartRequestDTO;
import com.wiley.cartmicroservice.dto.CartResponseDTO;
import com.wiley.cartmicroservice.entity.Cart;

public interface CartService {

	Cart exists(Integer customerId, Integer productId);

	void saveCart(Cart cart);

	String addProductToCart(CartRequestDTO cartRequestDTO);

	List<CartResponseDTO> getCartList(Integer customerId);

}