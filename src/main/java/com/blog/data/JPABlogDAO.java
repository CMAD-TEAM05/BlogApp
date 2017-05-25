package com.blog.data;

import javax.persistence.*;

import com.blog.api.User;

public class JPABlogDAO implements BlogDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.blog");
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}
	@Override
	public User findUser(int userId) {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		User userInfo = em.find(User.class, userId);
		em.getTransaction().commit();
		em.close();
		return userInfo;
	}

}
