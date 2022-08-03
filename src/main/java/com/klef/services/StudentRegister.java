package com.klef.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/faces/Student/StudentRegister")
public class StudentRegister extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      String sid=request.getParameter("sid");
	      String sname=request.getParameter("sname");
	      String sgender=request.getParameter("sgender");
	      String sdept=request.getParameter("sdept");
	      String semail=request.getParameter("semail");
	      String smob=request.getParameter("smob");
	      String spwd=request.getParameter("spwd");
	      try
	      {
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management?useSSL=false","root","Vamsikrishna@1");
	    	  PreparedStatement pstmt = con.prepareStatement(" insert into student_table(sid,sname,sgender,sdept,semail,smob,spwd) values(?,?,?,?,?,?,?,?) ");
	    	  pstmt.setString(1, sid);
	    	  pstmt.setString(2, sname);
	    	  pstmt.setString(3, sgender);
	    	  pstmt.setString(4, sdept);
	    	  pstmt.setString(5, semail);
	    	  pstmt.setString(6, smob);
	    	  pstmt.setString(7, spwd);
	    	  int n=pstmt.executeUpdate();
	    	  if(n>0) {
	    		  out.println("User Registration Successful");
	    	  }
	    	  else {
	    		  out.println("Failed to Register");
	    	  }
	      }
	      catch(Exception e)
	      {
	    	  out.println(e);
	      }
	}

}
