package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.MarksDao;
import com.spring.main.entity.Marks;
import com.spring.main.service.imp.IMarksService;

@Service(value = "marksService")
public class MarksService implements IMarksService {
	
	@Autowired
	MarksDao marksDao;

	@Override
	public Marks save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marks update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marks edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		marksDao.delete(marksDao.getMarksById(id));
		return true;
	}

	@Override
	public List<Marks> getAll() {
		
		return marksDao.getAll();
	}

}
