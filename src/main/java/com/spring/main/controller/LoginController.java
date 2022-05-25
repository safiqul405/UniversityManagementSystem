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

import com.spring.main.dao.StudentDao;
import com.spring.main.entity.AssignStudentCourse;
import com.spring.main.entity.Student;
import com.spring.main.service.AssignStudentCourseService;


@RestController
public class LoginController {
	@Autowired
	StudentDao studentDao;
	@Autowired
	AssignStudentCourseService assignStudentCourseService;

	@GetMapping("/adminlogin")
	public ModelAndView login() {

		return new ModelAndView("login/login");
	}

	@PostMapping("/admindashboard")
	public ModelAndView loginSuccess(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Map<String, Object> map = new HashMap<String, Object>();

		if (email.equalsIgnoreCase("admin@gmail.com") && password.equalsIgnoreCase("1234")) {
			return new ModelAndView("admin/dashboard");
		} else {
			map.put("status", "Incorrect Email or password");
			return new ModelAndView("login/login", "map", map);
		}
	}

	@GetMapping("/studentLogin")
	public ModelAndView studentLog() {
		return new ModelAndView("studentLogin/login");
	}

	@PostMapping("/studentDash")
	public ModelAndView studentLogin(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Map<String, Object> map = new HashMap<String, Object>();
		
		if (email.equalsIgnoreCase("student@gmail.com") && password.equalsIgnoreCase("1234")) {
			return new ModelAndView("studentDashBoard/dashboard");
		}else {
			map.put("status", "Incorrect Email or password");
			return new ModelAndView("studentLogin/login", "map", map);
		}
	}

	@GetMapping("/facultyLogin")
	public ModelAndView facultyLog() {
		return new ModelAndView("facultyLogin/login");
	}

	@PostMapping("/facultyDash")
	public ModelAndView facultyLogin(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Map<String, Object> map = new HashMap<String, Object>();
		
		if (email.equalsIgnoreCase("faculty@gmail.com") && password.equalsIgnoreCase("1234")) {
			return new ModelAndView("facultyDashBoard/dashboard");
		}else {
			map.put("status", "Incorrect Email or password");
			return new ModelAndView("facultyLogin/login", "map", map);
		}
	}

	
	@RequestMapping("/admitCardSearch")
	public ModelAndView admitCard() {

		return new ModelAndView("admitCardAdmin/admitCardSearch");
	}
	
	@RequestMapping("/admitCard")
	public ModelAndView admitCard1() {
		
		return new ModelAndView("admitCardAdmin/admitCard");
	}

	@RequestMapping("/getAdmitCard")
    public ModelAndView getAdmitCard(HttpServletRequest request) {
        int sid = Integer.parseInt(request.getParameter("sid"));
        System.out.println(sid);
        List<AssignStudentCourse> asc = assignStudentCourseService.getAll();
        List<Student> st = studentDao.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("courses", asc);
        map.put("st", st);
        return new ModelAndView("admitCardAdmin/admitCard", "map", map);
    }
	
}
