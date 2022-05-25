package com.spring.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.ISemeterController;
import com.spring.main.entity.Department;
import com.spring.main.entity.Semester;
import com.spring.main.entity.University;
import com.spring.main.service.DepartmentService;
import com.spring.main.service.SemesterService;
import com.spring.main.service.UniversityService;

@RestController
@RequestMapping("/semester")
public class SemesterController implements ISemeterController {

	@Autowired
	UniversityService universityService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	SemesterService semesterService;

	@Override
	@GetMapping("/create")
	public ModelAndView create() {

		List<University> uni = universityService.getAll();
		List<Department> dept = departmentService.getAll();
		List<Semester> semes = semesterService.getAll();
		Map<String,Object> map = new HashMap<>();
		map.put("uni", uni);
		map.put("dept", dept);
		map.put("semes", semes);
		
		return new ModelAndView("/semester/create","map",map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		 Semester sem = semesterService.save(request);
		 return new ModelAndView("semester/create","sem",sem);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") String semesterCode) {
		Semester semest = semesterService.getSemesterByCode(semesterCode);
		List<Department> depart = departmentService.getAll();
		List<University> unive = universityService.getAll();
		
		Map data = new HashMap();
		data.put("semester", semest);
		data.put("department", depart);
		data.put("university", unive);
		return new ModelAndView("semester/edit","data",data);
	}

	@Override
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		semesterService.update(request);
		List<Semester> sem = semesterService.getAll();
		return new ModelAndView("semester/view","sem",sem);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		boolean status = semesterService.delete(id);
		List<Semester> seme = semesterService.getAll();
		return new ModelAndView("semester/view","seme",seme);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Semester> semester = semesterService.getAll();
		return new ModelAndView("semester/view","semester",semester);
	}

}
