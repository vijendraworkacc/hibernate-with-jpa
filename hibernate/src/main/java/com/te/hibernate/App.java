package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		
		//Employees employees = new Employees(3, "AJay", 2200);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employees");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		//entityManager.persist(employees);
		Employees find = entityManager.find(Employees.class, 1);
		System.out.println(find);
		
		transaction.commit();
		
	}
}
