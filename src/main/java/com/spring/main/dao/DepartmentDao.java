package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Department;
import com.spring.main.entity.University;

@Repository(value = "departmentDao")
@Transactional
public class DepartmentDao {
	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Department save(Department d) {
    	getSession().save(d);
    	getSession().flush();
    	return d;
    }
    
    public List<Department> getAll(){
    	//String sql = "from department";
    	List <Department> dep = getSession().createCriteria(Department.class).list();
    	return dep;
    }
    
    public Department getDepartmentByCode(String deptCode) {
    	  String sql = "from department where deptCode = '" + deptCode + "'";
          List<Department> dList = getSession().createQuery(sql).list();
          return dList.get(0);
      }
    public Department update(Department d) {
    	getSession().saveOrUpdate(d);
    	getSession().flush();
    	return d;
    }
    
    public Department delete(Department d) {
        getSession().delete(d);
        getSession().flush();
        return d;
    }
    
}
