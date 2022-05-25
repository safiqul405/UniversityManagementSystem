package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Attendance;
import com.spring.main.entity.Student;

@Repository(value = "attendanceDao")
@Transactional
public class AttendanceDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}
	
	public Attendance save(Attendance a) {
		getSession().save(a);
		getSession().flush();
		return a;
	}

	public List<Attendance> getAll() {
		String sql = "from attendance";
		List<Attendance> at = getSession().createQuery(sql).list();
		return at;
	}
	
	public Attendance getAttendanceById(String id) {
		String sql = "from attendance where id = '" + id + "'";
		List<Attendance> aList = getSession().createQuery(sql).list();
		return aList.get(0);
	}
	public Attendance update(Attendance a) {
		getSession().saveOrUpdate(a);
		getSession().flush();
		return a;
	}

	public Attendance delete(Attendance a) {
		getSession().delete(a);
		getSession().flush();
		return a;
	}
	
	public Attendance getStudentByCode(String sid) {
		String sql = "from attendance where sid = '" + sid + "'";
		List<Attendance> aList = getSession().createQuery(sql).list();
		return aList.get(0);
	}

}
