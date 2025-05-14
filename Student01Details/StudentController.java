package com.nit.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.StudentDetails;
import com.nit.setvice.StudentServices;


@RestController
@RequestMapping("/std")

public class StudentController {
	@Autowired
	private StudentServices services;

	    @PostMapping
	    public StudentDetails createStudent(@RequestBody StudentDetails student) {
	        return services.create(student);
	    }

	    @GetMapping
	    public List<StudentDetails> getAllStudents() {
	        return services.readAll();
	    }

	    @PutMapping("/{id}")
	    public StudentDetails updateStudent(@PathVariable Integer id, @RequestBody StudentDetails student) {
	        return services.update(id, student);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Integer id) {
	    	services.deleteById(id);
	    }
	}

