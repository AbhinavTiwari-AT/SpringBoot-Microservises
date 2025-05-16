package com.abhinav.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhinav.entity.Student;

@Repository //it is optional because we are extending from JpaRepository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	
	public List<Student> findByGender(String gender);
		
	// select*from student_dtls where rank >= : rank;
	public List<Student> findByRankGreaterThanEqual(long rank);
	
	// select * from student_dtls where rank <= :rank;  
	public List<Student> findByRankIsLessThanEqual(long rank);
	
	//male students who are having rank >=  100;
	// select * from student_dtls where student_gender = male and rank >= : rank;
	
	public List<Student> findByGenderAndRankGreaterThanEqual(String gender, long rank);

}  
  