package com.wiley.cartmicroservice.service;

import com.wiley.cartmicroservice.entity.Product;

public interface ProductService {

	Product getProductbyId(Integer productId);

}