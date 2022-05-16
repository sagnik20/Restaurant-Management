/**
 * 
 */
package com.project3.RestaurantManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Sagnik & Venkatesh
 *
 */

@Data
@Entity

public class Customer implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
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
