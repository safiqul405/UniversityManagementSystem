package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Marks;
import com.spring.main.entity.SemesterFee;

@Repository(value = "semesterFeeDao")
@Transactional
public class SemesterFeeDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public SemesterFee save(SemesterFee sf) {
		getSession().save(sf);
		getSession().flush();
		return sf;
	}

	public List<SemesterFee> getAll() {
		List<SemesterFee> sef = getSession().createCriteria(SemesterFee.class).list();
		return sef;
	}

	public Marks getSemesterFeeById(String id) {
		String sql = "from SemesterFee where id = '" + id + "'";
		List<Marks> sfList = getSession().createQuery(sql).list();
		return sfList.get(0);
	}

	public SemesterFee update(SemesterFee sf) {
		getSession().saveOrUpdate(sf);
		getSession().flush();
		return sf;
	}

	public SemesterFee delete(SemesterFee sf) {
		getSession().delete(sf);
		getSession().flush();
		return sf;
	}

}
