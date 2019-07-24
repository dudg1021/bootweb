package com.dudg.bootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dudg.bootweb.mapper")
public class BootwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootwebApplication.class, args);
	}

}
