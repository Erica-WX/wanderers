package com.wanderers.wanderers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wanderers.wanderers.app.dao")
public class WanderersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WanderersApplication.class, args);
	}

}
