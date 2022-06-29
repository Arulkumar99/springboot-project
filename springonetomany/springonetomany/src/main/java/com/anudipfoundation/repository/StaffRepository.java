package com.anudipfoundation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudipfoundation.bean.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> 
{

}
