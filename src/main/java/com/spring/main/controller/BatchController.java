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

import com.spring.main.controller.imp.IBatchController;
import com.spring.main.entity.Batch;
import com.spring.main.service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController implements IBatchController {
	
	@Autowired
	BatchService batchService;
	
	@Override
	@GetMapping("create")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("batch/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Batch batch = batchService.save(request);
		return new ModelAndView("batch/create","batch",batch);
	}

	@Override
	@GetMapping("/edit/{batchCode}")
	public ModelAndView edit(@PathVariable("batchCode") String batchCode) {
		// TODO Auto-generated method stub
		Batch b = batchService.getBatchByCode(batchCode);
		return new ModelAndView("batch/edit","b",b);
	}

	@Override
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		batchService.update(request);
		List<Batch> bList = batchService.getAll();
		return new ModelAndView("batch/view","bList",bList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		
		boolean status = batchService.delete(id);
		List<Batch> batch = batchService.getAll();
		return new ModelAndView("batch/view","batch",batch);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Batch> batch = batchService.getAll();
		return new ModelAndView("batch/view","batch",batch);
	}

}
