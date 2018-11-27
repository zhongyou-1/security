package com.qidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement //开启扫描
@SpringBootApplication
public class SecurityApplication    {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
