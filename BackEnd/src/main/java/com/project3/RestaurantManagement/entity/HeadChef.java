package com.project3.RestaurantManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.project3.RestaurantManagement.entityInterface.EntityInterface;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class HeadChef implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hcId;
	
	@Column(nullable = false)
	private String hcEmail;
	
	@Column(nullable = false)
	private String hcPassword;
	
	@Column(nullable = false)
	private String hcName;
	
	@Column(nullable = false)
	private String hcPhone;

}
