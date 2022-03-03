package com.sac.student.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sac.student.entity.Student;
import com.sac.student.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public String createStudent(Student student) {
		try {
			studentRepository.save(student);
			return "Student Record Created Successfully";
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	@Transactional
	public String updateStudent(Student student) {
		try {
			studentRepository.save(student);
			return "Student Record Updated Successfully";

		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	@Transactional
	public String deleteStudent(Student student) {

		try {
			studentRepository.delete(student);
			return "Student Record Deleted Successfully";

		} catch (Exception e) {
			throw e;
		}
	}
}
