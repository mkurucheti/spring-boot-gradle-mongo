package com.springboot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongo.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	public Student findOneByName(String name);
}
