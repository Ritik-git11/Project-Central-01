package com.nit.Iservice;

import java.util.List;

import com.nit.entity.StudentDetails;

public interface IStudentServices {

	  public StudentDetails create(StudentDetails student);
	 
	 public List<StudentDetails> readAll();
	 
	  public StudentDetails update(Integer id, StudentDetails newStudentDetails);
	  
	  public void deleteById(Integer id);

}
