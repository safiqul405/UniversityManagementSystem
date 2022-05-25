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

import com.spring.main.controller.imp.IFacultyController;
import com.spring.main.entity.Faculty;
import com.spring.main.entity.Student;
import com.spring.main.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController implements IFacultyController {
	
	@Autowired
	FacultyService facultyService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("faculty/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Faculty faculty = facultyService.save(request);
		return new ModelAndView("faculty/create","faculty",faculty);
	}

	@Override
	@GetMapping("/edit/{fid}")
	public ModelAndView edit(String id) {		
		Faculty f = facultyService.getFacultyByCode(id);
		return new ModelAndView("faculty/edit","f", f);
	}

	@Override
	@RequestMapping(value = "/update",method =RequestMethod.POST )
	public ModelAndView update(HttpServletRequest request) {
		facultyService.update(request);
		List<Faculty> fList = facultyService.getAll();
		return new ModelAndView("faculty/view","fList",fList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		
		facultyService.delete(id);	
		List<Faculty> fLists = facultyService.getAll();
		return new ModelAndView("faculty/view","fLists",fLists);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Faculty> fList = facultyService.getAll();
		return new ModelAndView("faculty/view","fList",fList);
	}
	
}
