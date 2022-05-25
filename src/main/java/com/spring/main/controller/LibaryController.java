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

import com.spring.main.controller.imp.ILibaryController;
import com.spring.main.entity.Libary;
import com.spring.main.service.LibaryService;

@RestController
@RequestMapping("/libary")
public class LibaryController implements ILibaryController {
	
	@Autowired
	LibaryService libaryService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("libary/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {

		libaryService.save(request);
		return new ModelAndView("libary/create");
	}

	@Override
	@GetMapping("/edit/{bookCode}")
	public ModelAndView edit(@PathVariable("bookCode") String bookCode) {
		Libary l = libaryService.getLibaryByCode(bookCode);
		return new ModelAndView("libary/edit","l", l);
	}

	@Override
	@RequestMapping(value = "/update",method =RequestMethod.POST )
	public ModelAndView update(HttpServletRequest request) {

		libaryService.update(request);
		List<Libary> lList = libaryService.getAll();
		return new ModelAndView("libary/view","lList",lList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		boolean status = libaryService.delete(id);
		List<Libary> liba = libaryService.getAll();
		return new ModelAndView("libary/view","liba",liba);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Libary> libary = libaryService.getAll();
		return new ModelAndView("libary/view","libary",libary);
	}

}
