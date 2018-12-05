package com.qidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableDiscoveryClient  //，声明这个一个服务提供者。
@EnableTransactionManagement //开启扫描
@SpringBootApplication
@EnableFeignClients // 声明这个一个服务消费者。(//启用feign进行远程调用)
public class SecurityApplication    {
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
