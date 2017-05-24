package com.ustc.se.bbs.mybatis.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.entity.User;
import com.ustc.se.bbs.service.UserService;

public class UserTest extends BaseTest{
	
	@Autowired
	UserService userService;
	
	@Test
	public void selectByID(){
		User user = userService.selectUserByUserID(1);
		System.out.println(user.getUserName() + user.getUserPassword() + user.getUserAge());
	}
}
