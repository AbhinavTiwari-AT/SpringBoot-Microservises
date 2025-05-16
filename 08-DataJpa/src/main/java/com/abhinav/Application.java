  package com.abhinav;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhinav.Repo.StudentRepo;
import com.abhinav.entity.Student;

import jakarta.persistence.Entity;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	  
	  StudentRepo studentRepo = context.getBean(StudentRepo.class); 
//	  System.out.println(studentRepo.getClass().getName());

//	  Student student = new Student();
	  
//	  student.setGender("male");
//	  student.setId(103);
//	  student.setName("Abhinav");
//	  student.setRank(01);
//	  studentRepo.save(student);
//	  
	  
//	  Optional<Student> optional = studentRepo.findById(103);
//	  
//	  if (optional.isPresent()) {
//		  
//		  System.out.println(optional.get());
//	
//	}
//	    
	  
//	  Iterable<Student> list = studentRepo.findAll();
//	  
//	  list.forEach(System.out::println);
	  
//	  studentRepo.deleteById(101);
//	  
//	  if (studentRepo.existsById(103))
//	  {
//		  System.out.println("the record is present");
//	  }else {
//		System.out.println("not present");
//	}
//	  
	  
//	  long count = studentRepo.count();
//	  System.out.println("Records are" + count);
	
	  
	  // if we want to insert multiple records at a time we have to go for below methods
//	  
//	  Student s1 = new Student(103,"Orlen",901,"male");
//	  Student s2 = new Student(104,"Cathy",902,"Female");
//	  Student s3 = new Student(105,"Buttler",903,"male");
//	  Student s4 = new Student(106,"smith",904,"male");
//	    
//	  List<Student> students = Arrays.asList(s1,s2,s3,s4);
//	  
//	  studentRepo.saveAll(students);
	  
	  
 
//	  List<Student> maleStudents = studentRepo.findByGender("male");
//	  
//	  maleStudents.forEach(g -> System.out.println(g));
	  
//	  List<Student> students = studentRepo.findByRankGreaterThanEqual(1000);   
//	  
//	  students.forEach(s -> System.out.println(s));
	  
//	  List<Student> students = studentRepo.findByRankIsLessThanEqual(903);
//	  
//	  students.forEach(System.out::println);
 
	   List<Student> students =studentRepo.findByGenderAndRankGreaterThanEqual("female",1000);
	   students.forEach(System.out::println);
	     
	}  
}
