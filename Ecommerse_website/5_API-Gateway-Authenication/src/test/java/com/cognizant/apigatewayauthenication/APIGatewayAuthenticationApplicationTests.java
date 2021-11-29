package com.cognizant.apigatewayauthenication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.chiranjeet.apigatewayauthenication.APIGatewayAuthenticationApplication;

@SpringBootTest
public class APIGatewayAuthenticationApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Test
	  public void applicationStarts() {
	    APIGatewayAuthenticationApplication.main(new String[] {});
	  }

}
