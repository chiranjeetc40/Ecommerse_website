package com.wiley.cartmicroservice.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.cartmicroservice.dto.CartDTO;
import com.wiley.cartmicroservice.dto.CartRequestDTO;
import com.wiley.cartmicroservice.dto.CartResponseDTO;
import com.wiley.cartmicroservice.dto.CustomerWishlistDTO;
import com.wiley.cartmicroservice.dto.CustomerWishlistRequestDTO;
import com.wiley.cartmicroservice.dto.StatusDTO;
import com.wiley.cartmicroservice.exception.QuantityLimitExceededException;
import com.wiley.cartmicroservice.service.CartService;
import com.wiley.cartmicroservice.service.CustomerWishlistService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value={"/cart"})
public class CartController {
	
	@Autowired
	private CartService cartServiceImpl;
	
	@Autowired
	private CustomerWishlistService customerWishlistServiceImpl;
	
	@PostMapping("/addProductToCart")
	public StatusDTO addProductToCart(@RequestBody CartRequestDTO cartRequestDTO){
		log.info("Add Product to Cart from addProductToCart Controller method");
		StatusDTO statusDTO = new StatusDTO(cartServiceImpl.addProductToCart(cartRequestDTO));
		log.info("Add product to cart service executed successfuly");
		return statusDTO;
		
	}
	
	@GetMapping("/getCart/{customerId}")
	public List<CartResponseDTO> getCartList(@PathVariable Integer customerId) {
		log.info("Get CartList from  getCartList Controller method");
		List<CartResponseDTO> cartList = cartServiceImpl.getCartList(customerId);
		log.info("get cartList by customer id service executed successfuly");
		return cartList;
	}
	
	@PostMapping("/addToCustomerWishlist")
	public StatusDTO addToCustomerWishList(@RequestBody CustomerWishlistRequestDTO customerWishlist) {
		log.info("Add customer wishList from addToCustomerWishList controller method");
		return customerWishlistServiceImpl.addToCustomerWishList(customerWishlist);
	}
	
	@GetMapping("/getWishlist/{customerId}")
	public List<CustomerWishlistDTO> getAllWishlist(@PathVariable Integer customerId){
		log.info("Get cart wishlist from getAllWishlist Controller method");
		List<CustomerWishlistDTO> customerDTOList= customerWishlistServiceImpl.getAllWishlist(customerId);		
		log.info("get cart service call ended");
        return customerDTOList;
	}

}
