package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="student_table")
public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @Column(name="studid")
  private int sid;
  @Column(name="sname")
  private String sname;
  @Column(name="sgender")
  private String sgender;
  @Column(name="sdept")
  private String sdept;
  @Column(name="semail")
  private String email;
  @Column(name="smobile")
  private int mobile;
  @Column(name="spwd")
  private String spwd;
  
  public String getSpwd() {
    return spwd;
  }
  public void setSpwd(String spwd) {
    this.spwd = spwd;
  }
  public int getSid() {
    return sid;
  }
  public void setSid(int sid) {
    this.sid = sid;
  }
  public String getSname() {
    return sname;
  }
  public void setSname(String sname) {
    this.sname = sname;
  }
  public String getSgender() {
    return sgender;
  }
  public void setSgender(String sgender) {
    this.sgender = sgender;
  }
  public String getSdept() {
    return sdept;
  }
  public void setSdept(String sdept) {
    this.sdept = sdept;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getMobile() {
    return mobile;
  }
  public void setMobile(int mobile) {
    this.mobile = mobile;
  }
}