package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.DepartmentDao;
import com.spring.main.dao.UniversityDao;
import com.spring.main.entity.Department;
import com.spring.main.entity.University;
import com.spring.main.service.imp.IDepartmentService;

@Service(value = "departmentService")
public class DepartmentService implements IDepartmentService {
	
	@Autowired
	UniversityDao universityDao;
	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public Department save(HttpServletRequest request) {
		Department d = new Department();
		d.setUniCode(request.getParameter("uniCode"));
		d.setUniName(request.getParameter("uniName"));
		d.setDeptCode(request.getParameter("deptCode"));
		d.setDeptName(request.getParameter("deptName"));
		return departmentDao.save(d);
	}
	
	public Department getDepartmentByCode(String deptCode) {
		return departmentDao.getDepartmentByCode(deptCode);
	}

	@Override
	public Department edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department update(HttpServletRequest request) {
		Department d = new Department();
		d.setId(Integer.parseInt(request.getParameter("id")));
		System.out.println(d.getId() + "        .....");
		d.setUniCode(request.getParameter("uniCode"));
		d.setUniName(request.getParameter("uniName"));
		d.setDeptCode(request.getParameter("deptCode"));
		d.setDeptName(request.getParameter("deptName"));
		return departmentDao.update(d);
	}

	@Override
	public List<Department> getAll() {
		
		return departmentDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		departmentDao.delete(departmentDao.getDepartmentByCode(id));
		return true;
	}

}
