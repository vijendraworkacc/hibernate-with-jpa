package com.te.hibernate.jpa.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL01 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String query = "from Call";
		Query query_ = entityManager.createQuery(query);
		List resultList = query_.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
		// entityTransaction.begin();
		// entityManager.persist(phone);
		// entityTransaction.commit();
	}	
}
