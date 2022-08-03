package com.klef.services;

import javax.ejb.Remote;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Librarian;
import com.klef.ep.models.Student;

@Remote
public interface AdminRemote {
	public Admin Alogin(Admin a);
	public String AddLibrarian(Librarian li);
	public String AddStudent(Student stu);
}
