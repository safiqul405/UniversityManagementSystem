package com.spring.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "semesterFee")
@Table(name = "semesterFee")
public class SemesterFee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private int tutionFee;
	private int specialFee;
	private int facilitiesFee;
	private int studentIdFee;
	private int libraryFee;
	private int technologyFee;
	private int registrationFee;
	private int housingFee;
	private int financialAid;
	private int totalFee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(int tutionFee) {
		this.tutionFee = tutionFee;
	}
	public int getSpecialFee() {
		return specialFee;
	}
	public void setSpecialFee(int specialFee) {
		this.specialFee = specialFee;
	}
	public int getFacilitiesFee() {
		return facilitiesFee;
	}
	public void setFacilitiesFee(int facilitiesFee) {
		this.facilitiesFee = facilitiesFee;
	}
	public int getStudentIdFee() {
		return studentIdFee;
	}
	public void setStudentIdFee(int studentIdFee) {
		this.studentIdFee = studentIdFee;
	}
	public int getLibraryFee() {
		return libraryFee;
	}
	public void setLibraryFee(int libraryFee) {
		this.libraryFee = libraryFee;
	}
	public int getTechnologyFee() {
		return technologyFee;
	}
	public void setTechnologyFee(int technologyFee) {
		this.technologyFee = technologyFee;
	}
	public int getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(int registrationFee) {
		this.registrationFee = registrationFee;
	}
	public int getHousingFee() {
		return housingFee;
	}
	public void setHousingFee(int housingFee) {
		this.housingFee = housingFee;
	}
	public int getFinancialAid() {
		return financialAid;
	}
	public void setFinancialAid(int financialAid) {
		this.financialAid = financialAid;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	
	

}
