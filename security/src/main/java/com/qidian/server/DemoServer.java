package com.qidian.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @title 服务提供者对外暴露接口
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月27日下午9:00:23 @功能描述：
 */
@RestController
public class DemoServer {

	@GetMapping("hello")
	public String hello( ) {

		 System.out.println(" 服务提供者 get  进来了。。。");
	/***
		 * 具体业务逻辑
		 */

		return "hello----我是服务提供者 get";
	}

	
	@PostMapping("helloPost")
	public String helloPost( ) {

		 System.out.println(" 服务提供者 Post  进来了。。。");
	/***
		 * 具体业务逻辑
		 */

		return "hello----我是服务提供者 Post";
	}
 
}
