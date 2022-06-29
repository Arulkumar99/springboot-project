package com.anudipfoundation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudipfoundation.bean.Batch;
import com.anudipfoundation.repository.BatchRepository;

@Service
public class BatchService 
{
    @Autowired
	public BatchRepository br;
	 
	public List<Batch>getAllBatch()
	{
		List<Batch>batch=new ArrayList<>();
	br.findAll().forEach(batchs->batch.add(batchs));
	return batch;
		
	}
	public Batch getBatchById(long batchId)
	{
       return br.getById(batchId);
	}
	public void createBatch(Batch batch)
	{
	br.save(batch);
	}
	public void updateBatch(long batchId, Batch batch) {
		br.save(batch);
		
	}
	
	public void deleteById(long batchId) {
		br.deleteById(batchId);
		
	}
	public void save(Batch batch) {
		br.save(batch);
		
	}
	
}
