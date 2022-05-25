package com.spring.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IPaymentController;
import com.spring.main.entity.Payment;
import com.spring.main.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController implements IPaymentController {

	@Autowired
	PaymentService paymentService ;
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("payment/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		paymentService.save(request);
		return null;
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return new ModelAndView("payment/create");
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Payment> pList = paymentService.getAll();
		return new ModelAndView("payment/view","pList",pList);
	}

}
