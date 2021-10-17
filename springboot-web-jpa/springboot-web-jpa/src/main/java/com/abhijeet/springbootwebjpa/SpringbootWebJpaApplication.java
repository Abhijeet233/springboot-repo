package com.abhijeet.springbootwebjpa;

import com.abhijeet.springbootwebjpa.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootWebJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext con =SpringApplication.run(SpringbootWebJpaApplication.class, args);
		TestService t1= con.getBean(TestService.class);
		t1.t();
	}

}
