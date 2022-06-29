package com.anudipfoundation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudipfoundation.bean.Batch;

public interface BatchRepository extends JpaRepository<Batch,Long> 
{

}
