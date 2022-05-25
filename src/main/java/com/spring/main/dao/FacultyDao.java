package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.Faculty;


@Repository(value = "facultyDao")
@Transactional
public class FacultyDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Faculty save(Faculty f) {
    	getSession().save(f);
    	getSession().flush();
    	return f;  	
    }
    public List<Faculty> getAll(){
    	String sql = "from faculty";
        List<Faculty> st = getSession().createQuery(sql).list();
        return st;
    }
    
    public Faculty getFacultyByCode(String fid) {
  	  String sql = "from faculty where fid = '" + fid + "'";
        List<Faculty> sList = getSession().createQuery(sql).list();
        return sList.get(0);
    }
    
    
    public Faculty update(Faculty f) {
    	getSession().saveOrUpdate(f);
    	getSession().flush();
    	return f;
    }
    
    public Faculty delete(Faculty f) {
    	String sql = "delete faculty where fid = '"+f.getFid()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return f;
    }
	
}
