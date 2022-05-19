/**
 * 
 */
package com.project3.RestaurantManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sagnik
 *
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Admin implements EntityInterface {

	@Id
	@GeneratedValue
	private int id;
	private String aEmail;
	private String aPassword;
	private String aName;
	private String aPhone;
}
