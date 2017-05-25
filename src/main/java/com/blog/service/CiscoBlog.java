package com.blog.service;

import com.blog.api.BlogInterface;
import com.blog.api.User;
import com.blog.data.BlogDAO;
import com.blog.data.JPABlogDAO;

public class CiscoBlog implements BlogInterface{
    private BlogDAO dao = new JPABlogDAO(); 
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.addUser(user);
		return;
	}
	@Override
	public User findUser(int userId){
		User userInfo = dao.findUser(userId);
		return userInfo;
	}
}
