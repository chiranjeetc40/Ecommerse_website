package com.yash.productmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productmicroservice.dto.ProductDTO;
import com.yash.productmicroservice.entity.Product;
import com.yash.productmicroservice.exception.ProductNotFoundException;
import com.yash.productmicroservice.exception.RatingGreaterThan5Exception;
import com.yash.productmicroservice.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value={"/product"})
public class ProductController {

	@Autowired
	private ProductService productServiceImpl;

	@GetMapping(value = { "/searchProductById/{id}" })
	public ProductDTO searchProductById(@PathVariable Integer id) {
		log.info("Inside searchProductById method");
		ProductDTO productDTO = productServiceImpl.searchProductById(id);
		log.info("Exiting searchProductById method");
		return productDTO;

	}

	@GetMapping(value = { "/searchProductByName/{name}" })
	public ProductDTO searchProductByName(@PathVariable String name) {
		log.info("Inside searchProductByName method");
		ProductDTO productDTO = productServiceImpl.searchProductByName(name);
		log.info("Exiting searchProductByName method");
		return productDTO;

	}

	@PostMapping(value = { "/addProductRating/{id}/{rating}" })
	public String addProductRating(@PathVariable Integer id, @PathVariable int rating)
			throws ProductNotFoundException, RatingGreaterThan5Exception {

		log.info("Inside addProductRating method");
		productServiceImpl.addProductRating(id, rating);
		log.info("Exiting addProductRating method");
		return "Rating added Successfully to the Product";

	}
	
	@GetMapping("/getAllProducts")
	public List<ProductDTO> getAllProducts() 
	{
		log.info("fetching all the products");
		List<ProductDTO> productList = productServiceImpl.getAllProducts();
		log.info("All products Displayed Successfully");
		return productList;
	}

}
