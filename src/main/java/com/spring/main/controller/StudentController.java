package com.spring.main.controller;

import java.util.HashMap;
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

import com.spring.main.controller.imp.IStudentController;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Student;
import com.spring.main.service.BatchService;
import com.spring.main.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController implements IStudentController {
	
	@Autowired
	BatchService batchService;
	@Autowired
	StudentService studentService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<Batch> batch = batchService.getAll();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("batch", batch);
		return new ModelAndView("student/create","map",map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {

		studentService.save(request);
		return new ModelAndView("student/create");
	}

	@Override
	@GetMapping("/edit/{sid}")
	public ModelAndView edit(@PathVariable String sid) {
		Student stud = studentService.getStudentByCode(sid);
		List<Batch> batch = batchService.getAll();
		Map s = new HashMap<>();
		s.put("stud", stud);
		s.put("batch", batch);
		return new ModelAndView("student/edit","s", s);
	}

	@Override
	@RequestMapping(value = "/update",method =RequestMethod.POST )
	public ModelAndView update(HttpServletRequest request) {
		
		studentService.update(request);
		List<Student> sList = studentService.getAll();
		return new ModelAndView("student/view","sList",sList);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		studentService.delete(id);
		List<Student> sLists = studentService.getAll();
		return new ModelAndView("student/view","sLists",sLists);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Student> sList = studentService.getAll();
		return new ModelAndView("student/view","sList",sList);
	}
	
	@PostMapping("/getStudentByBatch")
	public List<Student> getStudentByBatch(HttpServletRequest request) {
		List<Student> sList = studentService.getStudentByBatch(request.getParameter("batchCode"));
		return sList;
	}
	
	@GetMapping("/viewf")
	public ModelAndView getAllStudent() {
		List<Student> sList = studentService.getAll();
		return new ModelAndView("fStudent/view","sList",sList);
	}
	
	/*
	 * @GetMapping("/studentDash") public ModelAndView studentLog() { return new
	 * ModelAndView("studentDashBoard/dashboard"); }
	 */

}
