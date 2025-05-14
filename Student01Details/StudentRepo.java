package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.StudentDetails;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Integer> {

}
