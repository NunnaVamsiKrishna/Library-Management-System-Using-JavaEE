package com.klef.ep.models;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.services.AdminRemote;

@ManagedBean(name="admin", eager=true)
public class AdminService {
	String aid;
	String pwd;
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@EJB(lookup = "java:global/EPFinalProject/AdminModel!com.klef.services.AdminRemote")
	AdminRemote ar;
	public String checkadmin()
	{
		String page = null;

	   try
	   {
			Admin admin = new Admin();
			admin.setAdminid(aid);
			admin.setPwd(pwd);
		   	
			Admin a = ar.Alogin(admin);
			
			
			
			if(a!=null)
		    {
		  	  //System.out.println("Login Success");
				//return "AdminPage.jsf";
				page = "adminhome.jsf";
		    }
		    else
		    {
		  	  //System.out.println("Login Failed");
		    	//return "AdminLogin.jsf";
		    	page = "AdminLogin.jsf";
		    }

			   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   return page;
	    
	}
}
