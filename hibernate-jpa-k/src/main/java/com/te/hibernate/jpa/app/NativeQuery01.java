package com.te.hibernate.jpa.app;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NativeQuery01 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String query_ = "select * from human_table where human_id = ?";
		Query nativeQuery = entityManager.createNativeQuery(query_);
		nativeQuery.setParameter(1, 1);
		
		List<Object[]> resultList = nativeQuery.getResultList();
		for (Object[] object : resultList) {
			System.out.println(Arrays.toString(object));
		}
	}
}
