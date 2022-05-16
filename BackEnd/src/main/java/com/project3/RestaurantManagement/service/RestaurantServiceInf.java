/**
 * 
 */
package com.project3.RestaurantManagement.service;

import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.EntityInterface;
import com.project3.RestaurantManagement.entity.HeadChef;

/**
 * @author evevryone
 *
 */
public interface RestaurantServiceInf {

	public EntityInterface LoginService(LoginHelper loginHelp);



	public boolean addHeadChef(HeadChef headChef);
}
