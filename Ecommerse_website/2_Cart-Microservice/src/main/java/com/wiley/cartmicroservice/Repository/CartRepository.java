package com.wiley.cartmicroservice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wiley.cartmicroservice.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	@Query("from Cart c where c.customerId=:customerId and c.productId=:productId")
	public Cart exists(Integer customerId, Integer productId);
	
	@Query("from Cart c where c.customerId=:customerId")
	public List<Cart> getCartList(Integer customerId);

}
