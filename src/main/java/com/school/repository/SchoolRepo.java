package com.school.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entities.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{
	
	public ArrayList<School> findAll();
	public School findByRegno(int regno);
	public ArrayList<School> findByName(String name);
	public ArrayList<School> findByDepartment(String dname);
	public ArrayList<School> findBySubjectAndDepartment(String subject, String dname);
}
