package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.main.dao.ResultDao;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Faculty;
import com.spring.main.entity.Result;
import com.spring.main.entity.Student;
import com.spring.main.service.imp.IResultService;
@Service(value = "resultService")
public class ResultService implements IResultService {

	
	@Autowired
	StudentService studentService;
	@Autowired
	BatchService batchService;
	@Autowired
	FacultyService facultyService;
	@Autowired
	CourseService courseService;
	@Autowired
	ResultDao resultDao;
	

	@Override
	public Result save(HttpServletRequest request) {
		Result r = new Result();
		Student student = studentService.getStudentByCode(request.getParameter("sid"));
		Batch batch = batchService.getBatchByCode(request.getParameter("batchCode"));
		Faculty faculty = facultyService.getFacultyByCode(request.getParameter("fid"));
		Course course = courseService.getCourseByCode(request.getParameter("courseCode"));
		
		r.setSid(student.getSid());
		r.setName(student.getName());
		r.setBatchName(batch.getBatchName());
		r.setCourseName(course.getCourseName());
		r.setSemesterName(course.getSemesterName());
		r.setFacultyName(faculty.getName());
		double classTest1 = Double.parseDouble(request.getParameter("ct1"));
		double classTest2 = Double.parseDouble(request.getParameter("ct2"));
		double midTerm = Double.parseDouble(request.getParameter("midterm"));
		double finalMarks = Double.parseDouble(request.getParameter("final"));

		double classTest1persentage = (classTest1 / 50.00) * 100.00; // 100 percent value
		double classTest1persentageTwo = (classTest1persentage / 100.00) * 10.00; /// 10 percent value
		double classTest2persentage = (classTest1 / 50.00) * 100.00; // 100 percent value
		double classTest2persentageTwo = (classTest1persentage / 100.00) * 10.00; /// 10 percent value
		double midTermPersentage = (midTerm / 100.00) * 100.00;
		double midTermPersentageTwo = (midTermPersentage / 100.00) * 20.00; /// 20 percent
		double finalPersentage = (finalMarks / 100.00) * 100.00;
		double finalPersentageTwo = (finalPersentage / 100.00) * 60.00;
		double totalMarks = classTest1persentageTwo + classTest2persentageTwo + midTermPersentageTwo
				+ finalPersentageTwo;

		String grade;
		double cgpa;

		if (totalMarks >= 80) {
			grade = "A+";
			cgpa = 4.00;
		} else if (totalMarks >= 70 && totalMarks < 80) {
			grade = "A";
			cgpa = 3.75;
		} else if (totalMarks >= 60 && totalMarks < 70) {
			grade = "B+";
			cgpa = 3.50;
		} else if (totalMarks >= 50 && totalMarks < 60) {
			grade = "B";
			cgpa = 3.00;
		} else if (totalMarks >= 45 && totalMarks < 50) {
			grade = "C";
			cgpa = 2.25;
		} else if (totalMarks >= 40 && totalMarks < 45) {
			grade = "D";
			cgpa = 2.00;
		} else {
			grade = "F";
			cgpa = 0.00;
		}

		r.setCt1Marks(classTest1);
		r.setCt2Marks(classTest2);
		r.setMidtermMarks(midTerm);
		r.setFinalMarks(finalMarks);

		r.setTotalMarks(totalMarks);
		r.setCgpa(cgpa);
		r.setGrade(grade);
		return resultDao.save(r);
	}

	@Override
	public Result edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Result> getAll() {

		return resultDao.getAll();
	}

	public Result getResultById(String id) {
		return resultDao.getResultById(id);
	}
	
	public Result getResultByUserId(String sid) {
		return resultDao.getResultByUserId(sid);
	}

	@Override
	public boolean delete(String id) {
		Result r = new Result();
		r = resultDao.delete(r);
		return true;
	}

}
