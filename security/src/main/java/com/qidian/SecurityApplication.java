package com.qidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableDiscoveryClient 
@EnableTransactionManagement //开启扫描
@SpringBootApplication //，声明这个一个服务提供者。
public class SecurityApplication    {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
