package com.nit.setvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Iservice.IStudentServices;
import com.nit.entity.StudentDetails;
import com.nit.repo.StudentRepo;

@Service
public class StudentServices implements IStudentServices {
	
	@Autowired
	private StudentRepo repo;
    public StudentDetails create(StudentDetails student) {
	        return repo.save(student);
	    }

	    public List<StudentDetails> readAll() {
	        return repo.findAll();
	    }

	    public StudentDetails update(Integer id, StudentDetails student) {
	        return repo.findById(id)
	                .map(student1 -> {
	                    student.setName(student.getName());
	                    student.setAge(student.getAge());
	                    student.setGrade(student.getGrade());
	                    return repo.save(student);
	                }).orElse(null);
	    }

	    public void deleteById(Integer id) {
	        repo.deleteById(id);
	    }


}

