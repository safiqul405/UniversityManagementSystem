package com.spring.main.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IDepartmentController;
import com.spring.main.entity.Department;
import com.spring.main.entity.University;
import com.spring.main.service.DepartmentService;
import com.spring.main.service.UniversityService;

@RestController
@RequestMapping("/department")
public class DepartmentController implements IDepartmentController {
	
	@Autowired
	UniversityService universityService;
	@Autowired
	DepartmentService departmentService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<University> univer = universityService.getAll();
		Map<String,Object> map = new HashMap<>();
		map.put("univer", univer);
		return new ModelAndView("department/create","map",map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		Department dept = departmentService.save(request);		
		return new ModelAndView("department/create","dept", dept);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") String id) {
		
		Department dept = departmentService.getDepartmentByCode(id);
		List<University> unive = universityService.getAll();
		Map data = new HashMap();
		data.put("department", dept);
		data.put("university", unive);
		return new ModelAndView("/department/edit","data",data);
	}

	@Override
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		departmentService.update(request);
		List<Department> dept= departmentService.getAll();
		return new ModelAndView("department/view","dept",dept);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		boolean status = departmentService.delete(id);
		List<Department> depts = departmentService.getAll();
		return new ModelAndView("department/view","depts",depts);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Department> depts = departmentService.getAll();
		return new ModelAndView("department/view","depts",depts);
	}
	
}
