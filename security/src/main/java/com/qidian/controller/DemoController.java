package com.qidian.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 
import com.qidian.entity.User;
import com.qidian.entity.comm.Result;
import com.qidian.entity.comm.Results;

/**
 * 
 * @title 测试类
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8  d
 * @创建时间：2018年11月27日下午7:40:15 @功能描述：
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	protected static Logger logger = LoggerFactory.getLogger(DemoController.class);
	@PersistenceContext
	private EntityManager manager;

	@Autowired
	private com.qidian.dao.UserDAO userDAO;

	@RequestMapping("/hello")
	@ResponseBody
	public Result hello() {
		logger.debug("访问getUserByName,Name={}");
		List<User> list = manager.createQuery("select o from User o ", User.class).getResultList();
		logger.error("----------info," + list.size());
		return  Results.SUCCESS.build(list);
	}

	@RequestMapping("/initdata")
	@ResponseBody
	public Result initData() {
        
        User user = new User();
        user.setName("管理员");
        user.setLoginName("admin");
        userDAO.insert(user);
        Assert.notNull(user.getId(),"用户ID不能为空！");
    	return  Results.SUCCESS.build();
	}
	
 
	@RequestMapping("/update")
	@ResponseBody
	public Result update(String key ,String updateName) {
        
        User user = manager.find(User.class, Long.parseLong(key));
        user.setName(updateName);
        userDAO.update(user);
    	return  Results.SUCCESS.build();
	}
	@RequestMapping("/remove")
	@ResponseBody
	public Result remove(String key ) {
        User user = manager.find(User.class, Long.parseLong(key));//指定key
        userDAO.remove(user);
    	return  Results.SUCCESS.build();
	}
}
