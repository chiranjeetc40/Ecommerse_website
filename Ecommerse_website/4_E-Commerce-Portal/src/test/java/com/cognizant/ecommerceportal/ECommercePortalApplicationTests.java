package com.cognizant.ecommerceportal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.chiranjeet.ecommerceportal.ECommercePortalApplication;


@SpringBootTest
class ECommercePortalApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}
	
	@Test
	  public void applicationStarts() {
	    ECommercePortalApplication.main(new String[] {});
	  }
	
	

}
