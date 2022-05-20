/**
 * 
 */
package com.project3.RestaurantManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author Sagnik & Venkatesh
 *
 */
@Entity
@Data

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
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Item.class)
	private List<Item> items;
}
