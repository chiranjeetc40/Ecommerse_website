package com.chiranjeet.ecommerceportal.dto;

import java.time.LocalDate;

import com.chiranjeet.ecommerceportal.entity.Product;
import com.chiranjeet.ecommerceportal.entity.Vendor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDTO {
	private Integer cartId;	
	private String zipCode;
	private LocalDate deliveryDate;
	private Integer customerId;
	private int quantity;
	private Product product;
	private Vendor vendor;
}