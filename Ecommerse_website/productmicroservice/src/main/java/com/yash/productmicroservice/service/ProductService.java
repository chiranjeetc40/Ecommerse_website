package com.yash.productmicroservice.service;

import java.util.List;

import com.yash.productmicroservice.dto.ProductDTO;
import com.yash.productmicroservice.exception.ProductNotFoundException;
import com.yash.productmicroservice.exception.RatingGreaterThan5Exception;

public interface ProductService {

	ProductDTO searchProductById(Integer id);

	ProductDTO searchProductByName(String name);

	void addProductRating(Integer id, int rating) throws ProductNotFoundException, RatingGreaterThan5Exception;

	List<ProductDTO> getAllProducts();

}