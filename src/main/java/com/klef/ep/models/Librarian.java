package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="librarian_table")
public class Librarian implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="lid")
	private int lid;
	@Column(name="lname")
	private String lname;
	@Column(name="lpwd")
	private String lpwd;
	public int getId() {
		return lid;
	}
	public void setId(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return lname;
	}
	public void setName(String lname) {
		this.lname = lname;
	}
	public String getPwd() {
		return lpwd;
	}
	public void setPwd(String lpwd) {
		this.lpwd = lpwd;
	}
	
}
