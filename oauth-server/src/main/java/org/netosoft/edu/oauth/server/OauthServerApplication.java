package org.netosoft.edu.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OauthServerApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args){
		SpringApplication.run(OauthServerApplication.class, args);
	}
	
}
