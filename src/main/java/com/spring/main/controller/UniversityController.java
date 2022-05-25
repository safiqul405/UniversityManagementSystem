package com.spring.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IUniversityController;
import com.spring.main.entity.University;
import com.spring.main.service.UniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController implements IUniversityController {
	
	@Autowired
	UniversityService universityService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("university/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		University univer = universityService.save(request);
		return new ModelAndView("university/create","univer",univer);
	}

	@Override
	@GetMapping("/edit/{uniCode}")
	public ModelAndView edit(@PathVariable String uniCode) {
		University u = universityService.getUniversityByCode(uniCode);
		return new ModelAndView("university/edit","u", u);
	}

	@Override
	@RequestMapping(value = "/update",method =RequestMethod.POST )
	public ModelAndView update(HttpServletRequest request) {
		
		universityService.update(request);
		List<University> uList =universityService.getAll();
		return new ModelAndView("university/view","uList",uList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		universityService.delete(id);
		List<University> uLists = universityService.getAll();
		return new ModelAndView("university/view","uLists",uLists);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<University> uList =universityService.getAll();
		return new ModelAndView("university/view","uList",uList);
	}

}
