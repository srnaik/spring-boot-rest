package com.sac.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sac.student.entity.Student;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	public List<Student> findByEmail(String email);
	
	@Query("select max(s.id) from Student s")
	public Integer findmaxId();

}
