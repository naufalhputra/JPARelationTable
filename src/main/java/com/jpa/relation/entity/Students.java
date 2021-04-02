package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

@Table(name="student")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String grade;
	

	  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    @JoinTable(name = "students_courses",
	    joinColumns = {
	            @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false, updatable = false)},
	    inverseJoinColumns = {
	            @JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false, updatable = false)})
	    private List<Courses> listCourses = new ArrayList<Courses>();

}