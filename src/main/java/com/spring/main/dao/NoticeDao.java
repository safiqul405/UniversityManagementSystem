package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.main.entity.Notice;

@Repository(value = "noticeDao")
@Transactional
public class NoticeDao {

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Notice save(Notice n) {
		getSession().save(n);
		getSession().flush();
		return n;
	}

	public List<Notice> getAll() {
		// String sql = "from department";
		List<Notice> dep = getSession().createCriteria(Notice.class).list();
		return dep;
	}

	public Notice getNoticeById(String id) {
		String sql = "from notice where id = '" + id + "'";
		List<Notice> nList = getSession().createQuery(sql).list();
		return nList.get(0);
	}

	public Notice update(Notice n) {
		getSession().saveOrUpdate(n);
		getSession().flush();
		return n;
	}

	public Notice delete(Notice n) {
		getSession().delete(n);
		getSession().flush();
		return n;
	}

	
    public List<Notice> getAllByStudentPrivilege() {
        
       String hqlQuery = "from notice where advantage=:advantage OR advantage=:advantageAll";
       Query query = getSession().createQuery(hqlQuery);
       query.setParameter("advantage", "Student");
       query.setParameter("advantageAll", "All");
       List<Notice> nList = query.list();
       getSession().flush();
       return nList;
    }

   
    public List<Notice> getAllByFacultyPrivilege() {
        String hqlQuery = "from notice where advantage=:advantage OR advantage=:advantageAll";
        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("advantage", "Faculty");
        query.setParameter("advantageAll", "All");
        List<Notice> nList = query.list();
        getSession().flush();
        return nList;
    }
}
