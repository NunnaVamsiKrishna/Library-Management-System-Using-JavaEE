package com.klef.ep.models;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.services.StudentService;

@ManagedBean(name = "stuBean",eager = true)
public class StudentBean {
	int id;
	String name;
	String gender;
	String dept;
	String email;
	int phone;
	String pwd;
	String response;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	@EJB(lookup = "java:global/EPFinalProject/StudentServiceImpl!com.klef.services.StudentService")
	StudentService sr;
	
	public void addStudent() {
		try {
			Student stu=new Student();
			stu.setSid(id);
			stu.setSname(name);
			stu.setSgender(gender);
			stu.setSdept(dept);
			stu.setEmail(email);
			stu.setMobile(phone);
			stu.setSpwd(pwd);
			response=sr.insertStudent(stu);
		}
		catch(Exception e) {
			response=e.getMessage();
		}
	}
	public String checkstu()
	{
		String page = null;

	   try
	   {
			Student stu = new Student();
			stu.setSid(id);
			stu.setSpwd(pwd);
		   	
			Student a = sr.checkStudent(stu);
			
			
			
			if(a!=null)
		    {
		  	  //System.out.println("Login Success");
				//return "AdminPage.jsf";
				page = "StudentHome.jsf";
		    }
		    else
		    {
		  	  //System.out.println("Login Failed");
		    	//return "AdminLogin.jsf";
		    	page = "StudentLogin.jsf";
		    }

			   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   return page;
	    
	}
}
