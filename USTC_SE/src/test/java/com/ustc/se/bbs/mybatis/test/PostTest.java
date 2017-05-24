package com.ustc.se.bbs.mybatis.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ustc.se.bbs.entity.Post;
import com.ustc.se.bbs.entity.User;
import com.ustc.se.bbs.service.PostService;
import com.ustc.se.bbs.service.UserService;

public class PostTest extends BaseTest{
	@Autowired
	PostService postService;
	@Autowired
	UserService userService;
	
	@Test
	public void selectPostByPostIDTest(){
		Post post = postService.selectPostByPostID(2);
		System.out.println(post.getPostTime()+"\n"+post.getPostContent());
	}
	
	@Test
	public void addPostTest(){
		Post post = new Post();
		post.setPostTime("2017-05-24 23:37:33");
		post.setPostContent("1.	Offer保留政策。对于拿到我司offer以及从我司出去创业的员工，我们根据实际情况在一段时间内保留该员工的职位；2. 弹性工作时间。为了员工能够有灵活的工作时间，我们采用弹性工作制；3. 理想的工作环境。我们从全世界招募优秀的工程师，除了为所有员工提供一流的工作环 境，同时也在全球范围内举办丰富多彩的活动来促进员工之间的交流。");
		post.setPostTitle("xxxx2222333");
		User user = userService.selectUserByUserID(1);
		post.setUser(user);
		postService.addPost(post);
		
	}

}
