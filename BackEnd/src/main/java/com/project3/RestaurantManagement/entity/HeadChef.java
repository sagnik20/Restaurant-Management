package com.project3.RestaurantManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 * @author Sudarsan
 * @author Runval
 * 
 */


@Data
@Entity
public class HeadChef implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	
	@Column(nullable = false)
	private String cEmail;
	
	@Column(nullable = false)
	private String cPassword;
	
	@Column(nullable = false)
	private String cName;
	
	@Column(nullable = false)
	private String cPhone;

}
