package com.spring.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "department")
@Table(name = "department")
public class Department {
	
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "deptCode")
    private String deptCode;
    
    @Column(name = "deptName")
    private String deptName;
    
    @Column(name = "uniCode")
    private String uniCode;
    
    @Column(name = "uniName")
    private String uniName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getUniCode() {
		return uniCode;
	}

	public void setUniCode(String uniCode) {
		this.uniCode = uniCode;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
    
    

}
