package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.UniversityDao;
import com.spring.main.entity.University;
import com.spring.main.service.imp.IUniversityService;

@Service(value = "universityService")
public class UniversityService implements IUniversityService {

	@Autowired
	UniversityDao universityDao;

	@Override
	public University save(HttpServletRequest request) {
		University u = new University();
		u.setUniCode(request.getParameter("uniCode"));
		u.setUniName(request.getParameter("uniName"));
		return universityDao.save(u);
	}
	
	public University getUniversityByCode(String uniCode) {
		return universityDao.getUniversitByCode(uniCode);
	}

	@Override
	public University edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public University update(HttpServletRequest request) {
		University u = new University();
		u.setUniCode(request.getParameter("uniCode"));
		u.setUniName(request.getParameter("uniName"));
		return universityDao.update(u);
	}

	@Override
	public List<University> getAll() {
		
		return universityDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		University u = universityDao.getUniversitByCode(id);
		universityDao.delete(u);
		return true;
	}
	
}
