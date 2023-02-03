package com.cognizant.vendormicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.vendormicroservice.VendormicroserviceApplication;


@SpringBootTest
class VendormicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	  public void applicationStarts() {
	    VendormicroserviceApplication.main(new String[] {});
	  }

}
