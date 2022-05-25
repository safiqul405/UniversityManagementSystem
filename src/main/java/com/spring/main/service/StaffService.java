package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dao.StaffDao;
import com.spring.main.entity.Staff;
import com.spring.main.service.imp.IStaffService;

@Service(value = "staffService")
public class StaffService implements IStaffService {
	
	@Autowired
	StaffDao staffDao;
	@Override
	public Staff save(HttpServletRequest request) {
		Staff st = new Staff();
		st.setName(request.getParameter("name"));
		st.setEmail(request.getParameter("email"));
		st.setName(request.getParameter("phone"));
		st.setName(request.getParameter("address"));
		st.setName(request.getParameter("dob"));
		st.setName(request.getParameter("religion"));
		st.setName(request.getParameter("bloodGroup"));
		st.setName(request.getParameter("gender"));
		return staffDao.save(st);
	}
	
	public Staff getStaffById(String id) {
		return staffDao.getStaffById(id);
	}

	@Override
	public Staff edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> getAll() {
		// TODO Auto-generated method stub
		return staffDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		staffDao.delete(staffDao.getStaffById(id));
		return true;
	}

}
