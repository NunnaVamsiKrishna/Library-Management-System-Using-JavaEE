package com.klef.ep.models;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="admin_table")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
  @Column(name="aid")
  private String adminid;
  @Column(name="apwd")
  private String pwd;
  
  public String getAdminid() {
    return adminid;
  }
  public void setAdminid(String adminid) {
    this.adminid = adminid;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  
  
}