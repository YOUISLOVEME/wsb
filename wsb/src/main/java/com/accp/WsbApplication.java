package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.dao")
public class WsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsbApplication.class, args);
	}

}
