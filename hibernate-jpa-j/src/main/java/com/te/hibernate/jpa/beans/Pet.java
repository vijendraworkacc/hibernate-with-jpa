package com.te.hibernate.jpa.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	private String petName;
	
	@ManyToMany(mappedBy = "pets", cascade = CascadeType.ALL)
	private List<Human> humans;

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + "]";
	}
}
