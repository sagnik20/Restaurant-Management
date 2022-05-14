/**
 * 
 */
package com.project3.RestaurantManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project3.RestaurantManagement.dao.AdminDao;
import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.EntityInterface;

/**
 * @author sagnik
 *
 */

@Service
public class RestaurantService implements RestaurantServiceInf {
	
	@Autowired
	private AdminDao aDao;

	@Override
	public EntityInterface LoginService(LoginHelper loginHelp) {
		if(loginHelp.getRole().equals("admin")) {
			Admin admin=null;
			if(aDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0)
				admin = aDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			return admin;
		}
		return null;
	}

}
