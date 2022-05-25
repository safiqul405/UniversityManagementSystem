package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.SemesterDao;
import com.spring.main.dao.UniversityDao;
import com.spring.main.entity.Department;
import com.spring.main.entity.Semester;
import com.spring.main.service.imp.ISemesterService;

@Service(value = "semesterService")
public class SemesterService implements ISemesterService{
	
	@Autowired
	UniversityDao universityDao;
	@Autowired
	SemesterDao  semesterDao ;
	
	@Autowired
	DepartmentService departmentService;

	@Override
	public Semester save(HttpServletRequest request) {
		Department dept = departmentService.getDepartmentByCode(request.getParameter("deptCode"));
		Semester se = new Semester();
		se.setSemesterCode(request.getParameter("semesterCode"));
		se.setSemesterName(request.getParameter("semesterName"));
		se.setDeptCode(dept.getDeptCode());
		se.setDeptName(dept.getDeptName());
		se.setUniCode(dept.getUniCode());
		se.setUniName(dept.getUniName());
		return semesterDao.save(se);
	}
	
	@Override
	public Semester edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public Semester update(HttpServletRequest request) {
    	Department dept = departmentService.getDepartmentByCode(request.getParameter("deptCode"));
		Semester se = getSemesterByCode(request.getParameter("semesterCode"));
       se.setId(Integer.parseInt(request.getParameter("id")));
       se.setSemesterCode(request.getParameter("semesterCode"));
       se.setSemesterName(request.getParameter("semesterName"));
       se.setDeptCode(dept.getDeptCode());
		se.setDeptName(dept.getDeptName());
		se.setUniCode(dept.getUniCode());
		se.setUniName(dept.getUniName());
       semesterDao.update(se);
       return se;
    }
    
    public Semester getSemesterByCode(String semesterCode) {
    	return  semesterDao.getSemesterByCode(semesterCode);
    }

	@Override
	public List<Semester> getAll() {
		// TODO Auto-generated method stub
		return semesterDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Semester d = new Semester();
		d = semesterDao.delete(d);
		return true;
	}
}
