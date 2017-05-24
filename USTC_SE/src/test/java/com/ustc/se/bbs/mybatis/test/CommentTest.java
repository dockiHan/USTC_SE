package com.ustc.se.bbs.mybatis.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.service.CommentService;

public class CommentTest extends BaseTest{
	
	@Autowired 
	CommentService commentService;
	

	@Test
	public void selectCommentByCommentIDTest(){
		
	}
}
