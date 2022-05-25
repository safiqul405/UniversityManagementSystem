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

import com.spring.main.controller.imp.ICourseController;
import com.spring.main.entity.Course;
import com.spring.main.entity.Department;
import com.spring.main.entity.Semester;
import com.spring.main.entity.University;
import com.spring.main.service.CourseService;
import com.spring.main.service.DepartmentService;
import com.spring.main.service.SemesterService;
import com.spring.main.service.UniversityService;

@RestController
@RequestMapping("/course")
public class CourseController implements ICourseController {

	@Autowired
	UniversityService universityService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	SemesterService semesterService;
	@Autowired
	CourseService courseService;

	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<University> uni = universityService.getAll();
		List<Department> dept = departmentService.getAll();
		List<Semester> semes = semesterService.getAll();
		List<Course> cour = courseService.getAll();

		Map<String, Object> map = new HashMap<>();
		map.put("university", uni);
		map.put("department", dept);
		map.put("semester", semes);
		map.put("course", cour);
		return new ModelAndView("/course/create", "map", map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		Course cours = courseService.save(request);
		return new ModelAndView("course/create", "cours", cours);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") String id) {
		Course cour = courseService.getCourseByCode(id);
		List<Semester> semest = semesterService.getAll();
		List<Department> depart = departmentService.getAll();
		List<University> unive = universityService.getAll();
		
		Map data = new HashMap();
		data.put("course", cour);
		data.put("semester", semest);
		data.put("department", depart);
		data.put("university", unive);
		return new ModelAndView("/semester/edit","data",data);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		courseService.update(request);
		List<Course> cour = courseService.getAll();
		return new ModelAndView("course/view", "cour", cour);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		boolean status = courseService.delete(id);
		List<Course> cours = courseService.getAll();
		return new ModelAndView("course/view", "cours", cours);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Course> cour = courseService.getAll();
		return new ModelAndView("course/view", "cour", cour);
	}

}
