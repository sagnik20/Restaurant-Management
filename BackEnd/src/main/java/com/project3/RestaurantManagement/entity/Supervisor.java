package com.project3.RestaurantManagement.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 * 
 * @author Venkatesh
 *
 */

@Entity
@Data

public class Supervisor implements EntityInterface{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	
	
	@Column(nullable = false)
	private String sEmail;
	
	@Column(nullable = false)
	private String sPassword;
	
	@Column(nullable = false)
	private String sName;
	
	@Column(nullable = false)
	private String sPhone;
	
}
