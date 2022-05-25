package com.spring.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IResultController;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Faculty;
import com.spring.main.entity.Result;
import com.spring.main.entity.Student;
import com.spring.main.service.BatchService;
import com.spring.main.service.CourseService;
import com.spring.main.service.FacultyService;
import com.spring.main.service.ResultService;
import com.spring.main.service.StudentService;

@RestController
@RequestMapping("/result")
public class ResultController implements IResultController {
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	@Autowired
	FacultyService facultyService;
	@Autowired
	CourseService courseService;
	@Autowired
	ResultService resultService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<Student> student = studentService.getAll();
		List<Batch> batch = batchService.getAll();
		List<Course> course = courseService.getAll();
		List<Faculty> faculty = facultyService.getAll();
		
		Map <String,Object> map = new HashMap<>();
		map.put("student", student);
		map.put("batch", batch);
		map.put("course", course);
		map.put("faculty", faculty);
		return new ModelAndView("fResult/create","map",map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		Result result = resultService.save(request);
		return new ModelAndView("fResult/create","result",result);
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
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
		
		List<Result> rList = resultService.getAll();
		return new ModelAndView("fResult/view", "rList", rList);
	}

}
