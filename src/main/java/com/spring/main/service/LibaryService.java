package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.LibaryDao;
import com.spring.main.entity.Libary;
import com.spring.main.service.imp.ILibaryService;

@Service(value = "libaryService")
public class LibaryService implements ILibaryService {
	
	@Autowired
	LibaryDao libaryDao;
	
	@Override
	public Libary save(HttpServletRequest request) {
		Libary l = new Libary();
		l.setBookCode(request.getParameter("bookCode"));
		l.setBookName(request.getParameter("bookName"));
		l.setAuthor(request.getParameter("author"));
		l.setGenre(request.getParameter("genry"));
		l.setPublisher(request.getParameter("publisher"));
		l.setQuantity(request.getParameter("quantity"));
		l.setEdition(request.getParameter("edition"));
		l.setPrice(request.getParameter("price"));
		return libaryDao.save(l);
	}
	
	public Libary getLibaryByCode(String bookCode){
		
		return libaryDao.getLibaryByCode(bookCode);
	}
	
	@Override
	public Libary edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libary update(HttpServletRequest request) {
		Libary l = new Libary();
		l.setBookCode(request.getParameter("bookCode"));
		l.setBookName(request.getParameter("bookName"));
		l.setAuthor(request.getParameter("author"));
		l.setPublisher(request.getParameter("publisher"));
		l.setQuantity(request.getParameter("quantity"));
		l.setEdition(request.getParameter("edition"));
		l.setPrice(request.getParameter("price"));
		return libaryDao.update(l);
	}

	@Override
	public List<Libary> getAll() {
		// TODO Auto-generated method stub
		return libaryDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		libaryDao.delete(libaryDao.getLibaryByCode(id));
		return true;
	}

}
