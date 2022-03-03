package com.sac.student.service;

import java.util.List;

import com.sac.student.entity.Student;

public interface StudentService {
	
	public String createStudent(Student student);
	public List<Student> getAllStudents();
	public String updateStudent(Student student);
	public String deleteStudent(Student student);

}
