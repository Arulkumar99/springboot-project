package com.anudipfoundation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudipfoundation.bean.Batch;
import com.anudipfoundation.service.BatchService;
@RestController
public class BatchController 
{


	 @Autowired
		public BatchService bs;
		
	    @GetMapping("/batch")
	    public List<Batch>getAllBatch()
	    
	    {
	    	
	    	return bs.getAllBatch();
	    }
	    
	    @GetMapping("/batch/{batchId}")
	    public Batch getBatchById(@PathVariable long batchId)
	    {
	    	return bs.getBatchById(batchId);
	    }
	    
	    @PostMapping("/batch")
	    public void createBatch(@RequestBody Batch batch)
	    
	    {
	    	bs.createBatch(batch);
	    }
	    
	    @PutMapping("/batch/{batchId}")
	    public void updateBatch(@PathVariable long batchId,@RequestBody Batch batch)
	    
	    {
	    	bs.save(batch);
	    }
	    
	    @DeleteMapping("/batch/{batchId}")
	    public void deleteBatch(@PathVariable long batchId)
	    
	    {
	    bs.deleteById(batchId);
	    }
	 
}
