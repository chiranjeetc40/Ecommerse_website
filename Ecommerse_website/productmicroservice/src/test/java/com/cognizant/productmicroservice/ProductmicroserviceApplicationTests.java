package com.cognizant.productmicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.productmicroservice.ProductmicroserviceApplication;

@SpringBootTest
class ProductmicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	  public void applicationStarts() {
	    ProductmicroserviceApplication.main(new String[] {});
	  }

}
