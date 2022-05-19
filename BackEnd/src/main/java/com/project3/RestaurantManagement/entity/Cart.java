/**
 * 
 */
package com.project3.RestaurantManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

/**
 * @author Sagnik 
 * @author Venkatesh
 *
 */

@Entity
@Data

public class Cart implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	//@JoinColumn(name="cEmail")
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
	@JoinColumn(name="cId")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Item.class)
	@JoinColumn(name="iId")
	private Item item;
	
	@Column(nullable = false)
	private Integer iQty;
	

}
