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
 * @author Sagnik 
 * @author Venkatesh
 *
 */
@Entity
@Data
<<<<<<< HEAD
=======

>>>>>>> c52356184400b2ff312aeaa57a727533587c3d28
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iId;
	
	@Column(nullable = false)
	private String iName;
	
	@Column(nullable = false)
	private String iDesc;
	
	@Column(nullable = false)
	private float iCost;
	
	@Column(nullable = false)
	private int icount;
	
	//For checking item is Available or not
	@Column(nullable=false)
	private Boolean status;
	
//	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
//	private Customer customer;
	
//	@Lob
//	private byte[] picByte;
//	
//	private String iftype;
//	private String ift;

	
}
