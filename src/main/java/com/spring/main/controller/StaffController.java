package com.spring.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IStaffController;
import com.spring.main.entity.Staff;
import com.spring.main.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController implements IStaffController {

	@Autowired
	StaffService staffService ;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("staff/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		staffService.save(request);
		return new ModelAndView("staff/create");
	}

	@Override
	@GetMapping("/edit/{bookCode}")
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/update",method =RequestMethod.POST )
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Staff> staff = staffService.getAll();
		return new ModelAndView("staff/view","staff",staff);
	}

}
