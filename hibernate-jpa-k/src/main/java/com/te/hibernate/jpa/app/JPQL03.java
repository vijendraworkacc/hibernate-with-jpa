package com.te.hibernate.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL03 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String query_ = "update from Human set humanName =:name where humanId =:id";
		Query query = entityManager.createQuery(query_);
		query.setParameter("name", "Updated Name");
		query.setParameter("id", 1);
		
		entityTransaction.begin();
		int executeUpdate = query.executeUpdate();
		entityTransaction.commit();
		
		System.out.println(executeUpdate);
	}
}
