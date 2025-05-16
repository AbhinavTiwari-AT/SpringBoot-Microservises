package com.abhinav.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_DTLS")
public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
  
	
	public Student(Integer id, String name, long rank, String gender) { 
 		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
	}


	@Id
	@Column(name = "std_Id")
	private Integer id;
	
	@Column(name = "std_name")
	private String name;
	
	@Column(name = "std_rank")
	private long rank;
	
	@Column(name = "std_gender")
	private String gender;
	
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

	public long getRank() {
		return rank;
	}

	public void setRank(long rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}
