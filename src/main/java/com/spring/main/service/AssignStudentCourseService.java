package com.spring.main.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.AssignStudentCourseDao;
import com.spring.main.entity.AssignStudentCourse;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Student;
import com.spring.main.service.imp.IAssignStudentCourseService;

@Service(value = "assignStudentCouresService")
public class AssignStudentCourseService implements IAssignStudentCourseService {
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	@Autowired
	CourseService courseService;
	@Autowired
	AssignStudentCourseDao assignStudentCourseDao;

	@Override
	public AssignStudentCourse save(HttpServletRequest request) {
		
		Map<String, String[]> map = request.getParameterMap();
		System.out.println(map.get("student_id[]").length);
		for (int i = 0; i < map.get("student_id[]").length ; i++) {
			System.out.println(map.get("student_id[]")[i]);
			AssignStudentCourse asc = new AssignStudentCourse();
			Student student = studentService.getStudentByCode(map.get("student_id[]")[i]);
			Batch batch = batchService.getBatchByCode(student.getBatchCode());
			Course course = courseService.getCourseByCode(request.getParameter("student_course_code"));
			asc.setSid(student.getSid());
			asc.setName(student.getName());
			asc.setBatchCode(batch.getBatchCode());
			asc.setBatchName(batch.getBatchName());
			asc.setCourseCode(course.getCourseCode());
			asc.setCourseName(course.getCourseName());
			asc.setSemesterCode(course.getSemesterCode());
			asc.setSemesterName(course.getSemesterName());
			asc.setDeptCode(course.getDeptCode());
			asc.setDeptName(course.getDeptName());
			asc.setUniCode(course.getUniCode());
			asc.setUniName(course.getUniName());
			assignStudentCourseDao.save(asc);
		}
		return new AssignStudentCourse();
	}
	
	public AssignStudentCourse getAssignStudentCourseById(String id) {
		return assignStudentCourseDao.getAssignStudentCourseById(id);
	}

	@Override
	public AssignStudentCourse edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignStudentCourse update(HttpServletRequest request) {
		AssignStudentCourse asc = new AssignStudentCourse();
		Student student = studentService.getStudentByCode(request.getParameter("sid"));
		Batch batch = batchService.getBatchByCode(request.getParameter("batchCode"));
		Course course = courseService.getCourseByCode(request.getParameter("courseCode"));
		asc.setSid(student.getSid());
		asc.setName(student.getName());
		asc.setBatchCode(batch.getBatchCode());
		asc.setBatchName(batch.getBatchName());
		asc.setCourseCode(course.getCourseCode());
		asc.setCourseName(course.getCourseName());
		asc.setSemesterCode(course.getSemesterCode());
		asc.setSemesterName(course.getSemesterName());
		asc.setDeptCode(course.getDeptCode());
		asc.setDeptName(course.getDeptName());
		asc.setUniCode(course.getUniCode());
		asc.setUniName(course.getUniName());
		
		return assignStudentCourseDao.update(asc);
	}

	@Override
	public List<AssignStudentCourse> getAll() {
		// TODO Auto-generated method stub
		return assignStudentCourseDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		AssignStudentCourse asc = new AssignStudentCourse();
		asc = assignStudentCourseDao.delete(asc);
		return true;
	}


}
