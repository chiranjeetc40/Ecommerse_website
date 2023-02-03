package com.wiley.cartmicroservice.dao;

import java.util.List;

import com.wiley.cartmicroservice.entity.Cart;

public interface CartDAO {

	Cart existsDao(Integer customerId, Integer productId);

	void saveCartDao(Cart cart);

	List<Cart> getCartListDao(Integer customerId);

}