package com.tpro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@JsonProperty("bookName")   //Json ciktida isminin bookName olmasini sagladi
	private String name;
	
	@JsonIgnore //sonsuz donguye girmemesi icin, kisaca buradan yeniden student class'ina gitmemesi icin bu annotation' u kullandik
	            // student - book arasi gidip gelmemesi icin
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public Student getStudent() {
		return student;
	}
	
	
	
	
	
	
	
	
	
	
}
