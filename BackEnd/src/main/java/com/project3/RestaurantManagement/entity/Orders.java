/**
 * 
 */
package com.project3.RestaurantManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;

/**
 * @author Sagnik 
 * @author Venkatesh
 *
 */

@Entity
@Data

public class Orders {
	@Id
	private Integer oId;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Item.class)
	@JoinColumn(name="iId")
	private Item item;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
	@JoinColumn(name="cId")
	private Customer customer;
	
	@Column(nullable = false)
	private String paymentmode;
	
	@Column(nullable = false)
	private int orderstatus;

}
