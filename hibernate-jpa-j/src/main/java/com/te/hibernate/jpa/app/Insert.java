package com.te.hibernate.jpa.app;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Human;
import com.te.hibernate.jpa.beans.Pet;

public class Insert {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pet pet = new Pet();
		pet.setPetName("Name01");
		
		Pet pet02 = new Pet();
		pet02.setPetName("Name02");
		
		Human human = new Human();
		human.setHumanName("Human01");
		
		Human human02 = new Human();
		human02.setHumanName("Human02");
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		pets.add(pet);
		pets.add(pet02);
		
		ArrayList<Human> humans = new ArrayList<Human>();
		humans.add(human);
		humans.add(human02);
		
		human.setPets(pets);
		human02.setPets(pets);
		
		pet.setHumans(humans);
		pet02.setHumans(humans);
		
		entityTransaction.begin();
		entityManager.persist(human);
		entityTransaction.commit();
	}
	
}
