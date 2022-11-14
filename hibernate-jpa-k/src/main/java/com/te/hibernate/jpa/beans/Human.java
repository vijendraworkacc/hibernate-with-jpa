package com.te.hibernate.jpa.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "human_table")
public class Human implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "human_id")
	private int humanId;

	@Column(name = "human_name")
	private String humanName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "hp", 
	joinColumns = @JoinColumn(name = "human_fk"), 
	inverseJoinColumns = @JoinColumn(name = "pet_fk"))
	private List<Pet> pets;

	@Override
	public String toString() {
		return "Human [humanId=" + humanId + ", humanName=" + humanName + ", pets=" + pets + "]";
	}
}
