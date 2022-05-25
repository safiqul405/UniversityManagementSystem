package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.University;


@Repository(value = "universityDAO")
@Transactional
public class UniversityDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public University save(University u) {
    	getSession().save(u);
    	getSession().flush();
    	return u;  	
    }
    public List<University> getAll(){
    	String sql = "from university";
        List<University> univer = getSession().createQuery(sql).list();
        return univer;
    }
    
    public University getUniversitByCode(String uniCode) {
  	  String sql = "from university where uniCode = '" + uniCode + "'";
        List<University> uList = getSession().createQuery(sql).list();
        return uList.get(0);
    }
    
    
    public University update(University u) {
    	String hql ="update university set uniName= '"+u.getUniName()+"' where uniCode = '"+u.getUniCode()+"'";
    	Query q = getSession().createQuery(hql);
    	q.executeUpdate();
    	getSession().flush();
    	return u;
    }
    
    public University delete(University u) {
    	String sql = "delete university where uniCode = '"+u.getUniCode()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return u;
    }
    

}
