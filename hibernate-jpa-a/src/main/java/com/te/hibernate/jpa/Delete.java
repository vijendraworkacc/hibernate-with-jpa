package com.te.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.User;

public class Delete {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, 1);
//		System.out.println(user);
		entityTransaction.begin();
		entityManager.detach(user);
//		entityManager.remove(user);
		User user2 = entityManager.merge(user);
		System.out.println(entityManager.contains(user2));
		entityManager.remove(user2);
		entityTransaction.commit();
	}
}
