package com.chiranjeet.ecommerceportal.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartRequestDTO {
		private Integer productId;
		private Integer customerId;
		private String zipcode;
		private int quantity;
	}
	
	
	
