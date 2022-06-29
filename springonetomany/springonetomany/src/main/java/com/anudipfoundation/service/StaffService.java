package com.anudipfoundation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudipfoundation.bean.Batch;
import com.anudipfoundation.bean.Staff;
import com.anudipfoundation.repository.StaffRepository;

@Service
public class StaffService 
{

	  @Autowired
      public StaffRepository staffRep;
	  
	  public List<Staff>getAllStaff()
	  {
		  List<Staff>staff=new ArrayList<>();
			staffRep.findAll().forEach(staffs->staff.add(staffs));
			return staff;
		  
	  }
	  
	  public Staff getStaffById(int staffId)
	  {
			return staffRep.findById(staffId).orElseThrow();
      }
	  
      public void createStaff(Staff staff)
      {
    	 staffRep.save(staff);
      }
      
      public void updateStaff(int staffId,Staff staff)
      {
    	staffRep.save(staff); 
      }
      
      

	public void deleteById(int staffId) {
		 staffRep.deleteById(staffId);
		
	}

	public void save(Staff staff) {
		staffRep.save(staff);		
	}

	
}
