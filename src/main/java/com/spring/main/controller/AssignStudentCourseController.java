package com.spring.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.main.controller.imp.IAssignStudentCourseController;
import com.spring.main.entity.AssignStudentCourse;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Student;
import com.spring.main.service.AssignStudentCourseService;
import com.spring.main.service.BatchService;
import com.spring.main.service.CourseService;
import com.spring.main.service.StudentService;

@RestController
@RequestMapping("/assignStudentCourse")
public class AssignStudentCourseController implements IAssignStudentCourseController {
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	@Autowired
	CourseService courseService;
	@Autowired
	AssignStudentCourseService assignStudentCouresService;

	@Override
	@GetMapping("/create")
	public ModelAndView create() {

		//List<Student> student = studentService.getAll();
		List<Batch> batch = batchService.getAll();
		List<Course> course = courseService.getAll();
		//List<AssignStudentCourse> asc = assignStudentCouresService.getAll();

		Map<String, Object> map = new HashMap<>();
	
		map.put("batch", batch);
		map.put("course", course);
	
		return new ModelAndView("assignStudentCourse/create", "map", map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
	
		  AssignStudentCourse asc = assignStudentCouresService.save(request); 
		  return new ModelAndView("assignStudentCourse/create", "asc", asc);
		 
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(String id) {

		List<Student> student = studentService.getAll();
		List<Batch> batch = batchService.getAll();
		List<Course> course = courseService.getAll();
		List<AssignStudentCourse> asc = assignStudentCouresService.getAll();

		Map<String, Object> data = new HashMap<>();
		data.put("student", student);
		data.put("batch", batch);
		data.put("course", course);
		data.put("asc", asc);
		return new ModelAndView("assignStudentCourse/edit", "data", data);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		assignStudentCouresService.update(request);
		List<AssignStudentCourse> asc = assignStudentCouresService.getAll();
		return new ModelAndView("assignStudentCourse/view", "asc", asc);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		boolean staus = assignStudentCouresService.delete(id);
		List<AssignStudentCourse> asc = assignStudentCouresService.getAll();
		return new ModelAndView("assignStudentCourse/view", "asc", asc);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<AssignStudentCourse> ascList = assignStudentCouresService.getAll();
		return new ModelAndView("assignStudentCourse/view", "ascList", ascList);
	}

}
