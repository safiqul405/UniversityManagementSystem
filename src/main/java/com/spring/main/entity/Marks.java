package com.spring.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "marks")
@Table(name = "marks")
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private int rangeFrom;
	private int rangeTo;
	private double cgpa;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRangeFrom() {
		return rangeFrom;
	}
	public void setRangeFrom(int rangeFrom) {
		this.rangeFrom = rangeFrom;
	}
	public int getRangeTo() {
		return rangeTo;
	}
	public void setRangeTo(int rangeTo) {
		this.rangeTo = rangeTo;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
