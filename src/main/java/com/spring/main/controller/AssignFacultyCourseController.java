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

import com.spring.main.controller.imp.IAssignFacultyCourseController;
import com.spring.main.entity.AssignFacultyCourse;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Faculty;
import com.spring.main.service.AssignFacultyCourseService;
import com.spring.main.service.BatchService;
import com.spring.main.service.CourseService;
import com.spring.main.service.FacultyService;

@RestController
@RequestMapping("/assignFacultyCourse")
public class AssignFacultyCourseController implements IAssignFacultyCourseController {
	@Autowired
	FacultyService facultyService;
	@Autowired
	CourseService courseService;
	@Autowired
	BatchService batchService;
	@Autowired
	AssignFacultyCourseService assignFacultyCourseService;
	@Override
	@GetMapping("create")
	public ModelAndView create() {
		List<Faculty> faculty = facultyService.getAll();
		List<Course> course = courseService.getAll();
		List<Batch> batch =batchService.getAll();
		Map <String,Object> map = new HashMap<>();
		map.put("faculty", faculty);
		map.put("course",course);
		map.put("batch",batch);
		return new ModelAndView("assignFacultyCourse/create","map",map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		AssignFacultyCourse afc = assignFacultyCourseService.save(request);
		return new ModelAndView("assignFacultyCourse/create","afc",afc);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(String id) {
		List<Faculty> faculty = facultyService.getAll();
		List<Course> course = courseService.getAll();
		
		Map <String,Object> data = new HashMap<>();
		data.put("faculty", faculty);
		data.put("course",course);
		return new ModelAndView("assignFacultyCourse/edit","data",data);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		assignFacultyCourseService.update(request);
		List<AssignFacultyCourse> afc = assignFacultyCourseService.getAll();		
		return new ModelAndView("assignFucaltyCourse/view", "afc", afc);
	}

	@Override
	public ModelAndView delete(String id) {
		boolean status = assignFacultyCourseService.delete(id);
		List<AssignFacultyCourse> afc = assignFacultyCourseService.getAll();
		return new ModelAndView("assignFacultyCourse/view","afc",afc);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		List<AssignFacultyCourse> afcList = assignFacultyCourseService.getAll();
		return new ModelAndView("assignFacultyCourse/view","afcList",afcList);
	}

}
