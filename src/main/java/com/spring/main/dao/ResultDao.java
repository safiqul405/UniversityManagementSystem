package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.Course;
import com.spring.main.entity.Result;

@Repository(value = "resultDao")
@Transactional
public class ResultDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Result save(Result r) {
    	getSession().save(r);
    	getSession().flush();
         return r;
     }
    
    public List<Result> getAll(){
    	List <Result> res = getSession().createCriteria(Result.class).list();
    	return res;
    }
    
    public Result getResultById(String id) {
  	  String sql = "from result where id = '" + id + "'";
        List<Result> rList = getSession().createQuery(sql).list();
        return rList.get(0);
    }
    
    public Result update(Result r) {
    	getSession().saveOrUpdate(r);
    	getSession().flush();
    	return r;
    }
    
    public Result delete(Result r) {
        getSession().delete(r);
        getSession().flush();
        return r;
    }
    
    public Result getResultByUserId(String sid) {
    	  String sql = "from result where sid = '" + sid + "'";
          List<Result> rList = getSession().createQuery(sql).list();
          return rList.get(0);
      }
}
