package com.spring.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "result")
@Table(name = "result")
public class Result {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	private String sid;
	private String name;
	private String semesterName;
	private String batchName;
	private String courseName;
	private String facultyName;
	private Double ct1Marks;
	private Double ct2Marks;
	private Double midtermMarks;
	private Double cgpa;
	private String grade;
	private Double finalMarks;
	private Double totalMarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public Double getCt1Marks() {
		return ct1Marks;
	}
	public void setCt1Marks(Double ct1Marks) {
		this.ct1Marks = ct1Marks;
	}
	public Double getCt2Marks() {
		return ct2Marks;
	}
	public void setCt2Marks(Double ct2Marks) {
		this.ct2Marks = ct2Marks;
	}
	public Double getMidtermMarks() {
		return midtermMarks;
	}
	public void setMidtermMarks(Double midtermMarks) {
		this.midtermMarks = midtermMarks;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getFinalMarks() {
		return finalMarks;
	}
	public void setFinalMarks(Double finalMarks) {
		this.finalMarks = finalMarks;
	}
	public Double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Double totalMarks) {
		this.totalMarks = totalMarks;
	}
	
}
