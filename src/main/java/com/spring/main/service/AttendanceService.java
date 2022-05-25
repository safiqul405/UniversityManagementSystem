package com.spring.main.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.AttendanceDao;
import com.spring.main.entity.Attendance;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Faculty;
import com.spring.main.entity.Student;
import com.spring.main.service.imp.IAttendanceService;

@Service(value = "attendanceService")
public class AttendanceService implements IAttendanceService {

	@Autowired
	StudentService studentService;
	//@Autowired
	//FacultyService facultyService;
	@Autowired
	BatchService batchService;
	@Autowired
	CourseService courseService;
	@Autowired
	AttendanceDao attendanceDao;

	@Override
	public Attendance save(HttpServletRequest request) {
		
		Map<String, String[]> map = request.getParameterMap();
		
		ArrayList<String> attends = new ArrayList<String>();
		for (int i = 0; i < map.get("attendance_status[]").length ; i++) {
			attends.add(map.get("attendance_status[]")[i]);		
		}
		for (int i = 0; i < map.get("student_id[]").length ; i++) {
		//System.out.println(map.get("student_id[]")[i]);
		Attendance attendance = new Attendance();
		Student student = studentService.getStudentByCode(map.get("student_id[]")[i]);
		//Faculty faculty = facultyService.getFacultyByCode(request.getParameter("facultyCode"));
		Batch batch = batchService.getBatchByCode(student.getBatchCode());
		Course course = courseService.getCourseByCode(request.getParameter("student_course_code"));
		if(attends.contains(map.get("student_id[]")[i])) {
			attendance.setStatus("PRESENT");
			System.out.println(map.get("student_id[]")[i]);
		}else {
			attendance.setStatus("ABSENT");
		}
		
		System.out.println(LocalDateTime.now());
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate); 
		attendance.setDate(strDate);
		attendance.setSid(student.getSid());
		attendance.setName(student.getName());
		//attendance.setFacultyName(request.getParameter("facultyName"));
		attendance.setBatchName(batch.getBatchName());
		attendance.setCourseName(course.getCourseName());
		 attendanceDao.save(attendance);
		}
		
		return new Attendance();
	}

	@Override
	public Attendance edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	 public Attendance getAttendanceById(String id) {
		 return attendanceDao.getAttendanceById(id);
	 }
	@Override
	public Attendance update(HttpServletRequest request) {
		Attendance attendance = new Attendance();
		Student student = studentService.getStudentByCode(request.getParameter("sid"));
		Batch batch = batchService.getBatchByCode(request.getParameter("batchCode"));
		Course course = courseService.getCourseByCode(request.getParameter("courseCode"));
		attendance.setSid(student.getSid());
		attendance.setName(student.getName());
		attendance.setBatchName(batch.getBatchName());
		attendance.setCourseName(course.getCourseName());
		return attendanceDao.update(attendance);
	}

	@Override
	public List<Attendance> getAll() {
		// TODO Auto-generated method stub
		return attendanceDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		Attendance  atted= new Attendance();
		atted = attendanceDao.delete(atted);
		return true;
	}
	
	public Attendance getStudentByCode(String sid ) {
		return attendanceDao.getStudentByCode(sid);
	}

}
