package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentdao {
	@Autowired
	Studentrepo repo;

	public Student insert(Student s) {
		return repo.save(s);
	}
	
}
