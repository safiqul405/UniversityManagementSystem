package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.AssignFacultyCourseDao;
import com.spring.main.entity.AssignFacultyCourse;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Course;
import com.spring.main.entity.Faculty;
import com.spring.main.service.imp.IAssignFacultyCourseService;

@Service(value = "assignFacultyCourseService")
public class AssignFacultyCourseService implements IAssignFacultyCourseService {
	
	@Autowired
	FacultyService facultyService; 
	@Autowired
	BatchService batchService;
	@Autowired
	CourseService courseService;
	@Autowired
	AssignFacultyCourseDao assignFacultyCourseDao;
	
	@Override
	public AssignFacultyCourse save(HttpServletRequest request) {
		AssignFacultyCourse afc = new AssignFacultyCourse();
		Faculty faculty = facultyService.getFacultyByCode(request.getParameter("facultyCode"));
		Batch batch = batchService.getBatchByCode(request.getParameter("batchCode"));
		Course course = courseService.getCourseByCode(request.getParameter("courseCode"));
		//afc.setId(Integer.parseInt(request.getParameter("id")));
		afc.setFid(faculty.getFid());
		afc.setName(faculty.getName());
		afc.setBatchCode(batch.getBatchCode());
		afc.setBatchName(batch.getBatchName());
		afc.setCourseCode(course.getCourseCode());
		afc.setCourseName(course.getCourseName());
		afc.setUniCode(course.getUniCode());
		afc.setUniName(course.getUniName());
		return assignFacultyCourseDao.save(afc);
	}
	
	public AssignFacultyCourse getAssignFacultyCourseById(String id) {
		return assignFacultyCourseDao.getAssignFacultyCourseById(id);
	}

	@Override
	public AssignFacultyCourse edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignFacultyCourse update(HttpServletRequest request) {
		AssignFacultyCourse afc = new AssignFacultyCourse();
		Faculty faculty = facultyService.getFacultyByCode(request.getParameter("fid"));
		Batch batch = batchService.getBatchByCode(request.getParameter("batchCode"));
		Course course = courseService.getCourseByCode(request.getParameter("courseCode"));
		afc.setId(Integer.parseInt(request.getParameter("id")));
		afc.setFid(faculty.getFid());
		afc.setName(faculty.getName());
		afc.setBatchCode(batch.getBatchCode());
		afc.setBatchName(batch.getBatchName());
		afc.setCourseCode(course.getCourseCode());
		afc.setCourseName(course.getCourseName());
		afc.setUniCode(course.getUniCode());
		afc.setUniName(course.getUniName());
		return assignFacultyCourseDao.update(afc);
	}

	@Override
	public List<AssignFacultyCourse> getAll() {
		// TODO Auto-generated method stub
		return assignFacultyCourseDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		AssignFacultyCourse afs = new AssignFacultyCourse();
		afs = assignFacultyCourseDao.delete(afs);
		return true;
	}

}
