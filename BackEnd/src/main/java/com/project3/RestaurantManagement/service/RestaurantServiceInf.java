/**
 * 
 */
package com.project3.RestaurantManagement.service;

import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.EntityInterface;

/**
 * @author evevryone
 *
 */
public interface RestaurantServiceInf {

	public EntityInterface LoginService(LoginHelper loginHelp);
}
