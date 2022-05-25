package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.PaymentDao;
import com.spring.main.entity.Payment;
import com.spring.main.service.imp.IPaymentService;

@Service(value = "paymentService")
public class PaymentService implements IPaymentService {
	
	@Autowired
	PaymentDao paymentDao;
	@Override
	public Payment save(HttpServletRequest request) {
		Payment pay = new Payment();
		pay.setId(Integer.parseInt(request.getParameter("id")));
		pay.setStudentName(request.getParameter("studentName"));
		pay.setStudentId(request.getParameter("studentId"));
		pay.setSemesterName(request.getParameter("semesterName"));
		pay.setPaymentMethod(request.getParameter("paymentMethod"));
		pay.setMobileNo(request.getParameter("mobileNo"));
		pay.setTrId(request.getParameter("trId"));
		pay.setPaymentDate(request.getParameter("paymentDate"));
		pay.setTutionFee(Integer.parseInt(request.getParameter("tutionFee")));
		pay.setSpecialFee(Integer.parseInt(request.getParameter("specialFee")));
		pay.setFacilitiesFee(Integer.parseInt(request.getParameter("facilitiesFee")));
		pay.setStudentIdFee(Integer.parseInt(request.getParameter("studentIdFree")));
		pay.setLibraryFee(Integer.parseInt(request.getParameter("libraryFee")));
		pay.setTechnologyFee(Integer.parseInt(request.getParameter("technologyFee")));
		pay.setRegistrationFee(Integer.parseInt(request.getParameter("registrationFee")));
		pay.setHousingFee(Integer.parseInt(request.getParameter("housingFee")));
		pay.setFinancialAid(Integer.parseInt(request.getParameter("financialAid")));
		pay.setTotalFee(Integer.parseInt(request.getParameter("totolFee")));
		return paymentDao.save(pay);
	}
	
	public Payment getPaymentById(String id) {
		return paymentDao.getLibaryById(id);
	}
	
	@Override
	public Payment edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment update(HttpServletRequest request) {
		Payment pay = new Payment();
		pay.setId(Integer.parseInt(request.getParameter("id")));
		pay.setStudentName(request.getParameter("studentName"));
		pay.setStudentId(request.getParameter("studentId"));
		pay.setSemesterName(request.getParameter("semesterName"));
		pay.setPaymentMethod(request.getParameter("paymentMethod"));
		pay.setMobileNo(request.getParameter("mobileNo"));
		pay.setTrId(request.getParameter("trId"));
		pay.setPaymentDate(request.getParameter("paymentDate"));
		pay.setTutionFee(Integer.parseInt(request.getParameter("tutionFee")));
		pay.setSpecialFee(Integer.parseInt(request.getParameter("specialFee")));
		pay.setFacilitiesFee(Integer.parseInt(request.getParameter("facilitiesFee")));
		pay.setStudentIdFee(Integer.parseInt(request.getParameter("studentIdFree")));
		pay.setLibraryFee(Integer.parseInt(request.getParameter("libraryFee")));
		pay.setTechnologyFee(Integer.parseInt(request.getParameter("technologyFee")));
		pay.setRegistrationFee(Integer.parseInt(request.getParameter("registrationFee")));
		pay.setHousingFee(Integer.parseInt(request.getParameter("housingFee")));
		pay.setFinancialAid(Integer.parseInt(request.getParameter("financialAid")));
		pay.setTotalFee(Integer.parseInt(request.getParameter("totolFee")));
		return paymentDao.update(pay);
	}

	@Override
	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return paymentDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		paymentDao.delete(paymentDao.getLibaryById(id));
		return true;
	}

}
