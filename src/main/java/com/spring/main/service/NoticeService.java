package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.NoticeDao;
import com.spring.main.entity.Notice;
import com.spring.main.service.imp.INoticeService;

@Service(value = "noticeService")
public class NoticeService implements INoticeService {
	
	@Autowired
	NoticeDao noticeDao;
	
	@Override
	public Notice save(HttpServletRequest request) {
		Notice n = new Notice();
		n.setAdvantage(request.getParameter("advatage"));
		n.setNoticeHeader(request.getParameter("noticeHeader"));
		n.setNoticeBody(request.getParameter("noticeBody"));
		n.setNoticeDate(request.getParameter("noticeDate"));
		return noticeDao.save(n);
	}
	
	public Notice getNoticeById( String id) {
		return noticeDao.getNoticeById(id);
	}
	
	@Override
	public Notice edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice update(HttpServletRequest request) {
		Notice n = new Notice();
		n.setAdvantage(request.getParameter("advatage"));
		n.setNoticeHeader(request.getParameter("noticeHeader"));
		n.setNoticeBody(request.getParameter("noticeBody"));
		n.setNoticeDate(request.getParameter("noticeDate"));
		return noticeDao.update(n);
	}

	@Override
	public List<Notice> getAll() {
		// TODO Auto-generated method stub
		return noticeDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		noticeDao.delete(noticeDao.getNoticeById(id));
		return true;
	}
	
	public List<Notice> getAllByStudentPrivilege() {
		
		return noticeDao.getAllByStudentPrivilege();
		
	}
	
	public List<Notice> getAllByFacultyPrivilege() {
		
		return noticeDao.getAllByFacultyPrivilege();
		
	}

}
