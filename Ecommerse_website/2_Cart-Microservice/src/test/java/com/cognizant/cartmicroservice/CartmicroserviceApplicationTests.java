package com.cognizant.cartmicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wiley.cartmicroservice.CartmicroserviceApplication;


@SpringBootTest
class CartmicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	  public void applicationStarts() {
	    CartmicroserviceApplication.main(new String[] {});
	  }

}
