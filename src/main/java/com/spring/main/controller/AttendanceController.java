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

import com.spring.main.controller.imp.IAttendanceController;
import com.spring.main.entity.Attendance;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Student;
import com.spring.main.service.AttendanceService;
import com.spring.main.service.BatchService;
import com.spring.main.service.CourseService;
import com.spring.main.service.StudentService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController implements IAttendanceController {
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	@Autowired
	CourseService courseService;
	@Autowired
	AttendanceService attendanceService;

	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<Student> student = studentService.getAll();
		List<Batch> batch = batchService.getAll();
		List<Course> course = courseService.getAll();

		Map<String, Object> map = new HashMap<>();
		map.put("student", student);
		map.put("batch", batch);
		map.put("course", course);

		return new ModelAndView("attendance/create", "map", map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		Attendance attendance = attendanceService.save(request);
		return new ModelAndView("attendance/create", "attendance", attendance);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(String id) {
		boolean status = attendanceService.delete(id);
		List<Attendance> att = attendanceService.getAll();
		return new ModelAndView("attendanc/view", "att", att);
	}

	@Override

	@GetMapping("/view")
	public ModelAndView getAll() {
		List<Attendance> aList = attendanceService.getAll();
		return new ModelAndView("attendance/view", "aList", aList);
	}

	@GetMapping("/viewS")
	public ModelAndView getStudentByCode() {
		List<Attendance> aList = attendanceService.getAll();
		return new ModelAndView("attendanceStudent/view", "aList", aList);
	}


}
