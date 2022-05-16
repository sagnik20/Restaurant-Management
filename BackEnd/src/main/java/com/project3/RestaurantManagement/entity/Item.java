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

@Data
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iId;
	
	@Column(nullable = false)
	private String iName;
	@Column(nullable = false)
	private String iDesc;
	@Column(nullable = false)
	private String iCost;
	@Column(nullable = false)
	private int icount;
	
//	@Lob
//	private byte[] picByte;
//	
//	private String iftype;
//	private String ift;

	
}
