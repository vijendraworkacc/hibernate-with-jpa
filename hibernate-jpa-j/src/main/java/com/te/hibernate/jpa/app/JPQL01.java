package com.te.hibernate.jpa.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL01 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String query_ = "from Human";
		Query query = entityManager.createQuery(query_);
		List resultList = query.getResultList();

		for (Object object : resultList) {
			System.out.println(object);
		}
	}

}
