package com.yash.productmicroservice.dao;

import java.util.List;

import com.yash.productmicroservice.entity.Product;

public interface ProductDAO {

	Product searchProductByIdDao(Integer id);

	Product searchProductByNameDao(String name);

	void addProductRatingDao(Product product);

	List<Product> getAllProductsDao();

}