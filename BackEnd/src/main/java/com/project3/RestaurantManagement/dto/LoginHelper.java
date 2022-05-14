/**
 * 
 */
package com.project3.RestaurantManagement.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author sagnik
 *
 */

@Data
public class LoginHelper {
	
	private String email;
	private String password;
	private String role;

}
