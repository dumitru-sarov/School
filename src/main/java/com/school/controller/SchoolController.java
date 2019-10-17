package com.school.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.school.entities.School;
import com.school.repository.SchoolRepo;


@RestController
public class SchoolController {
	
	@Autowired
	private SchoolRepo repo;

	@GetMapping("showAll")
	public ArrayList<School> showAll() {
		return repo.findAll();
	}
	@GetMapping("findRegno/{regno}")
	public School findRecord(@PathVariable int regno) {
		return repo.findByRegno(regno);
	}
	@GetMapping("findNames/{name}")
	public ArrayList<School> findByName(@PathVariable String name) {
		return repo.findByName(name);
	}
	@GetMapping("findDept/{dept}")
	public ArrayList<School> findByDept(@PathVariable String dept) {
		return repo.findByDepartment(dept);
	}
	@GetMapping("findSubjectAndDept/{subject}/{dept}")
	public ArrayList<School> findBySubAndDept(@PathVariable String subject, @PathVariable String dept) {
		return repo.findBySubjectAndDepartment(subject, dept);
	}
	
}
