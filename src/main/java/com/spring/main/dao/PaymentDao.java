package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Payment;
@Repository(value = "paymentDao")
@Transactional
public class PaymentDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Payment save(Payment p) {
		getSession().save(p);
		getSession().flush();
		return p;
	}

	public List<Payment> getAll() {
		List<Payment> pay = getSession().createCriteria(Payment.class).list();
		return pay;
	}

	public Payment getLibaryById(String id) {
		String sql = "from payment where id = '" + id + "'";
		List<Payment> pList = getSession().createQuery(sql).list();
		return pList.get(0);
	}

	public Payment update(Payment p) {
		getSession().saveOrUpdate(p);
		getSession().flush();
		return p;
	}

	public Payment delete(Payment p) {
		getSession().delete(p);
		getSession().flush();
		return p;
	}

}
