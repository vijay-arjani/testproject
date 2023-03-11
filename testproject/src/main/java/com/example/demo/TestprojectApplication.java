package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pojo.Student;

@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		
		Student student =new Student();
		student.setId(1);
		student.setName("Vijay");
		student.setContact_number("8302210140");
		
		System.out.println("Student Details"+student.toString());
		
		
		
	}

}
