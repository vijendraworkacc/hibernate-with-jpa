package com.te.hibernate.jpa.app;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL04 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String query_ = "select h.humanName, p.petName from Human as h INNER JOIN h.pets as p";
		Query query = entityManager.createQuery(query_);
		List<Object[]> resultList = query.getResultList();

		for (Object[] object : resultList) {
			System.out.println(Arrays.toString(object));
		}
	}

}
