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
		
		String query_ = "update from Pet set petName = 'Updated Name' where petId = 1";
		
		entityTransaction.begin();
		Query query = entityManager.createQuery(query_);
		int executeUpdate = query.executeUpdate();
		entityTransaction.commit();
		
		System.out.println(executeUpdate);
	}

}
