package com.spring.main.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.main.dao.BatchDao;
import com.spring.main.entity.Batch;
import com.spring.main.entity.Department;
import com.spring.main.service.imp.IBatchService;

@Service(value = "batchService")
public class BatchService implements IBatchService {
	
	@Autowired
	BatchDao batchDao;
	
	@Override
	public Batch save(HttpServletRequest request) {
		
		Batch batch = new Batch();
		batch.setBatchCode(request.getParameter("batchCode"));
		batch.setBatchName(request.getParameter("batchName"));
		batch.setBatchYear(request.getParameter("batchYear"));
		batch.setBatchType(request.getParameter("batchType"));	
		return batchDao.save(batch);
	}

	public Batch getBatchByCode(String batchCode) {
		return batchDao.getBatchByCode(batchCode);
	}
	
	@Override
	public Batch edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batch update(HttpServletRequest request) {
		
		Batch  batch = new Batch();
		batch.setBatchCode(request.getParameter("batchCode"));
		batch.setBatchName(request.getParameter("batchName"));
		batch.setBatchYear(request.getParameter("batchYear"));
		batch.setBatchType(request.getParameter("batchType"));
		return batchDao.update(batch);
	}

	@Override
	public List<Batch> getAll() {
		// TODO Auto-generated method stub
		return batchDao.getAll();
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		Batch b =new Batch();
		b = batchDao.delete(b);
		return false;
	}

}
