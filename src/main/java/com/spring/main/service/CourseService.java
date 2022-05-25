package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.CourseDao;
import com.spring.main.dao.DepartmentDao;
import com.spring.main.dao.SemesterDao;
import com.spring.main.dao.UniversityDao;
import com.spring.main.entity.Course;
import com.spring.main.entity.Department;
import com.spring.main.entity.Semester;
import com.spring.main.service.imp.ICourseService;

@Service(value = "courseService")
public class CourseService implements ICourseService {

	@Autowired
	UniversityService universityService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	SemesterService semesterService;
	@Autowired
	CourseDao courseDao;

	@Override
	public Course save(HttpServletRequest request) {
		Course c = new Course();
		//Department dept = departmentService.getDepartmentByCode(request.getParameter("deptCode"));
		Semester semester = semesterService.getSemesterByCode(request.getParameter("semesterCode"));
		c.setCourseCode(request.getParameter("courseCode"));		
		c.setCourseName(request.getParameter("courseName"));
		c.setSemesterCode(semester.getSemesterCode());
		c.setSemesterName(semester.getSemesterName());
		c.setDeptCode(semester.getDeptCode());
		c.setDeptName(semester.getDeptName());
		c.setUniCode(semester.getUniCode());
		c.setUniName(semester.getUniName());
				
		return courseDao.save(c);
	}

	@Override
	public Course edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course update(HttpServletRequest request) {
		Course c = new Course();
		Department dept = departmentService.getDepartmentByCode(request.getParameter("deptCode"));
		Semester semester = semesterService.getSemesterByCode(request.getParameter("semesterCode"));
		c.setCourseCode(request.getParameter("courseCode"));		
		c.setCourseName(request.getParameter("courseName"));
		c.setSemesterCode(semester.getSemesterCode());
		c.setSemesterName(semester.getSemesterName());
		c.setDeptCode(dept.getDeptCode());
		c.setDeptName(dept.getDeptName());
		c.setUniCode(dept.getUniCode());
		c.setUniName(dept.getUniName());
				
		return courseDao.update(c);
	}
	
	public Course getCourseByCode(String courseCode) {
		return courseDao.getCourseByCode(courseCode);
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		Course c = new Course();
		c = courseDao.delete(c);
		return true;
	}

}
