package com.spring.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "payment")
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String studentName;
	private String studentId;
	private String semesterName;
	private String paymentMethod;
	private String mobileNo;
	private String trId;
	private String paymentDate;
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
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getTrId() {
		return trId;
	}
	public void setTrId(String trId) {
		this.trId = trId;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
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
