package com.klef.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Student;

@Remote
public interface StudentService {
	public String insertStudent(Student stu);
	   public String deleteStudent(int sid);
	   public List<Student> viewallstudents();
	   public Student checkStudent(Student stu);
}
