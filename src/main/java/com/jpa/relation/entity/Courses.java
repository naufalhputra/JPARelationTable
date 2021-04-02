package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name="courses")

public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String abbrevation;
	private Double fee;
	private int modules;
	private String title;
	
	@ManyToMany(mappedBy = "listCourses", fetch = FetchType.LAZY)
    private List<Students> listStudents = new ArrayList<Students>();


		}
				
			
			
			

