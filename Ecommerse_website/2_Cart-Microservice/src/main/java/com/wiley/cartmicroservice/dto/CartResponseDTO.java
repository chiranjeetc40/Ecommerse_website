package com.wiley.cartmicroservice.dto;

import java.time.LocalDate;

import com.wiley.cartmicroservice.entity.Product;
import com.wiley.cartmicroservice.entity.Vendor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponseDTO {
	
	private Integer cartId;	
	private String zipCode;
	private LocalDate deliveryDate;
	private Integer customerId;
	private Integer quantity;
	private Product product;
	private Vendor vendor;

}
