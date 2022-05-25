package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.FacultyDao;
import com.spring.main.entity.Faculty;
import com.spring.main.entity.Student;;

@Service(value = "facultyService")
public class FacultyService {
	
	@Autowired
	FacultyDao facultyDao;
	
	public Faculty save(HttpServletRequest request) {
		Faculty f = new Faculty();
		f.setFid(Integer.parseInt(request.getParameter("fid")));
		f.setName(request.getParameter("name"));
		f.setEmail(request.getParameter("email"));
		f.setPhone(request.getParameter("phone"));
		f.setDob(request.getParameter("dob"));
		f.setReligion(request.getParameter("religion"));
		f.setGender(request.getParameter("gender"));
		return facultyDao.save(f);
	}
	
	public Faculty getFacultyByCode(String fid ) {
		return facultyDao.getFacultyByCode(fid);
	}

	public Object edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(HttpServletRequest request) {
		Faculty f = new Faculty();
		f.setFid(Integer.parseInt(request.getParameter("fid")));
		f.setName(request.getParameter("name"));
		f.setEmail(request.getParameter("email"));
		f.setPhone(request.getParameter("phone"));
		f.setDob(request.getParameter("dob"));
		f.setReligion(request.getParameter("religion"));
		f.setGender(request.getParameter("gender"));
		return facultyDao.update(f);
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return facultyDao.getAll();
	}

	public boolean delete(String id) {
		Faculty s = facultyDao.getFacultyByCode(id);
		return true;
	}


}
