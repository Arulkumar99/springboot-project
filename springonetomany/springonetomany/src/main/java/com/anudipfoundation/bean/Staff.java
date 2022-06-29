package com.anudipfoundation.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="staff")
public class Staff 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int staffId;
	private String staffName;
	private String staffDesignation;
	private int salary; 
//	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="batchId")
//    @JsonIgnore
//    private Batch batches;
	
}
