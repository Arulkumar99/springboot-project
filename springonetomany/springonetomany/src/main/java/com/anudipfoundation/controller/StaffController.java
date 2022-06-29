package com.anudipfoundation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudipfoundation.bean.Staff;
import com.anudipfoundation.service.StaffService;

@RestController
public class StaffController 
{

	
	@Autowired
	private StaffService staffService;
     
     @GetMapping("/staffs")
     public List<Staff>getAllStaff()
     {
    	 return staffService.getAllStaff();
     }
     @GetMapping("/staffs/{staffId}")
     public Staff getStaffById(@PathVariable int staffId)
     {
    	 return staffService.getStaffById(staffId);
     }
     @PostMapping("/staffs")
     public void createStaff(@RequestBody Staff staff)
     {
    	 staffService.createStaff(staff);
     }
     
     @PutMapping("/staffs/{staffId}")
     public void updateStaff(@PathVariable int staffId,@RequestBody Staff staff)
     {
    	 staffService.save(staff);
     }
     
     @DeleteMapping("/product/{id}")
     public void deleteById(@PathVariable int staffId)
     {
    	staffService.deleteById(staffId);
     }
	
}
