package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.Semester;

@Repository(value = "semesterDao")
@Transactional
public class SemesterDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Semester save(Semester se) {
    	getSession().save(se);
    	getSession().flush();
    	return se;  	
    }
    public List<Semester> getAll(){
    	String sql = "from semester";
        List<Semester> seme = getSession().createQuery(sql).list();
        return seme;
    }
    
    public Semester getSemesterByCode(String semesterCode) {
  	  String sql = "from semester where semesterCode = '" + semesterCode + "'";
        List<Semester> sList = getSession().createQuery(sql).list();
        System.out.println(sList.get(0).getSemesterName() + "   .");
        return sList.get(0);
    }
    
    
    public Semester update(Semester se) {
    	String hql ="update semester set semesterName = '"+se.getSemesterName()+"' ,deptCode = '"+se.getDeptCode()+"',deptName = '"+se.getDeptName()+"',uniCode = '"+se.getUniCode()+"',uniName = '"+se.getUniName()+"' where semesterCode = '"+se.getSemesterCode()+"'";
    	Query q = getSession().createQuery(hql);
    	q.executeUpdate();
    	getSession().flush();
    	return se;
    }
    
    public Semester delete(Semester se) {
    	String sql = "delete semester where semesterCode = '"+se.getSemesterCode()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return se;
    }

}
