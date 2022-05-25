package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.Course;


@Repository(value = "courseDao")
@Transactional
public class CourseDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Course save(Course c) {
    	getSession().save(c);
    	getSession().flush();
    	return c;
    }
    
    public List<Course> getAll(){
    	List <Course> cour = getSession().createCriteria(Course.class).list();
    	return cour;
    }
    
    public Course getCourseByCode(String courseCode) {
    	  String sql = "from course where courseCode = '" + courseCode + "'";
          List<Course> dList = getSession().createQuery(sql).list();
          return dList.get(0);
      }
    public Course update(Course c) {
    	getSession().saveOrUpdate(c);
    	getSession().flush();
    	return c;
    }
    
    public Course delete(Course c) {
        getSession().delete(c);
        getSession().flush();
        return c;
    }

}
