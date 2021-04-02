package com.jpa.relation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.relation.entity.Comment;
import com.jpa.relation.entity.Courses;
import com.jpa.relation.entity.Instructor;
import com.jpa.relation.entity.InstructorDetail;
import com.jpa.relation.entity.Post;
import com.jpa.relation.entity.Students;
import com.jpa.relation.repository.InstructorRepositrory;
import com.jpa.relation.repository.PostRepository;
import com.jpa.relation.repository.StudentsRepository;

@SpringBootApplication
public class JpaRelationTableApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationTableApplication.class, args);
	}
	
	 	@Autowired
	    InstructorRepositrory instructorRepository;
	 
	 	@Autowired
	 	PostRepository postres;
	 

		@Autowired
		StudentsRepository studentsRepository;
	 
	    public void run(String...  args) throws Exception {
	        Instructor instructor = new Instructor();
	        instructor.setEmail("naufalhputra@gmail.com");
	        instructor.setFirst_name("naufal");
	        instructor.setLast_name("hadi putra");

	        InstructorDetail detail = new InstructorDetail();
	        detail.setHobby("Bermain Game");
	        detail.setYoutube_channel("gg gaming");

	        instructor.setInstructorDetail(detail);

	        this.instructorRepository.save(instructor);
	    	
	    	/*Post post = new Post();
	    	post.setTitle("Tiktokers");
	    	post.setDescription("Cerita Tittok");
	    	
	    	Comment Comment1 = new Comment();
	    	Comment1.setText("wihhh");
	    	
	    	Comment Comment2 = new Comment();
	    	Comment2.setText("wihhh wihhh");
	    	
	    	List<Comment> lstComment = new ArrayList<Comment>();
	    	lstComment.add(Comment1);
	    	lstComment.add(Comment2);
	    	
	    	post.setLastComment(lstComment);
	    	
	    	this.postres.save(post);*/
	    	

			/*
			Students student1 = new Students();
			student1.setAge(26);
			student1.setGrade("A");
			student1.setName("Iwata Haruki");
			
			Students student2 = new Students();
			student2.setAge(25);
			student2.setGrade("B");
			student2.setName("Otsuka Sae");
			
			Courses course1 = new Courses();
			course1.setAbbrevation("IPA");
			course1.setFee(100000.00);
			course1.setModules(1);
			course1.setTitle("Ilmu Pengetahuan Alam");
			
			Courses course2 = new Courses();
			course2.setAbbrevation("MTK");
			course2.setFee(120000.00);
			course2.setModules(2);
			course2.setTitle("Matematika");
			
			Courses course3 = new Courses();
			course3.setAbbrevation("IPS");
			course3.setFee(95000.00);
			course3.setModules(3);
			course3.setTitle("Ilmu Pengetahuan Sosial");
			
			Courses course4 = new Courses();
			course4.setAbbrevation("BJep");
			course4.setFee(90000.00);
			course4.setModules(4);
			course4.setTitle("Bahasa Jepang");
			
			List<Courses> listCourse1 = new ArrayList<Courses>();
			listCourse1.add(course1);
			listCourse1.add(course2);
			
			List<Courses> listCourse2 = new ArrayList<Courses>();
			listCourse2.add(course3);
			listCourse2.add(course4);
			
			student1.setListCourses(listCourse1);
			student2.setListCourses(listCourse2);
			this.studentsRepository.save(student1);
			this.studentsRepository.save(student2);	    */}
	    
}
