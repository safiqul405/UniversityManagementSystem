package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.common.ICommonService;
import com.spring.main.dao.StudentDao;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Student;

@Service(value = "studentService")
public class StudentService implements ICommonService {
	
	@Autowired
	BatchService batchService;
	@Autowired
	StudentDao studentDao;
	
	@Override
	public Student save(HttpServletRequest request) {
		Student s = new Student();
		Batch b = batchService.getBatchByCode(request.getParameter("batchCode"));
		s.setSid(request.getParameter("sid"));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setPhone(request.getParameter("phone"));
		s.setBatchCode(b.getBatchCode());
		s.setBatchName(b.getBatchName());
		s.setDob(request.getParameter("dob"));
		s.setReligion(request.getParameter("religion"));
		s.setGender(request.getParameter("gender"));
		return studentDao.save(s);
	}
	
	public Student getStudentByCode(String sid ) {
		return studentDao.getStudentByCode(sid);
	}

	@Override
	public Object edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(HttpServletRequest request) {
		Student s = new Student();
		Batch b = batchService.getBatchByCode(request.getParameter("batchCode"));
		s.setSid(request.getParameter("sid"));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setPhone(request.getParameter("phone"));
		s.setBatchCode(b.getBatchCode());
		s.setBatchName(b.getBatchName());
		s.setDob(request.getParameter("dob"));
		s.setReligion(request.getParameter("religion"));
		s.setGender(request.getParameter("gender"));
		return studentDao.update(s);
	}

	@Override
	public List getAll() {
		
		return studentDao.getAll();
	}

	@Override
	public boolean delete(String sid) {
		Student s = studentDao.getStudentByCode(sid);
		return true;
	}

	public List<Student> getStudentByBatch(String batchCode) {
		
		List<Student> sList = studentDao.getStudentByBatch(batchCode);
		return sList;
	}

}
