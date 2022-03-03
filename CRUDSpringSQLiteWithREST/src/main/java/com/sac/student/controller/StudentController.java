package com.sac.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sac.student.entity.Student;
import com.sac.student.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "readstudents", method = RequestMethod.GET)
	public List<Student> readStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "createstudent", method = RequestMethod.POST)
	public String createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@RequestMapping(value = "updatestudent", method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@RequestMapping(value = "deletestudent", method = RequestMethod.DELETE)
	public String deleteStudent(@RequestBody Student student) {
		return studentService.deleteStudent(student);
	}

}
