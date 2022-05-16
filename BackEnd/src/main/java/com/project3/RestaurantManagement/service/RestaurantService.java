/**
 * 
 */
package com.project3.RestaurantManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project3.RestaurantManagement.dao.AdminDao;
import com.project3.RestaurantManagement.dao.HeadChefDao;
import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.EntityInterface;
import com.project3.RestaurantManagement.entity.HeadChef;

/**
 * @author sagnik
 *
 */

@Service
public class RestaurantService implements RestaurantServiceInf {
	
	@Autowired
	private AdminDao aDao;
	@Autowired
	private HeadChefDao hdao;

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
	
	//adding headchef
//	public boolean addHeadChef(HeadChef HeadChef) {
//		HeadChef hc = hdao.save(HeadChef);
//		
//		if (hc != null) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	//list head chefs
	public List<HeadChef> getHeadChef() {
		List<HeadChef> HeadChef = hdao.findAll();
		return HeadChef;
	}

	public boolean saveHeadChef(HeadChef HeadChef) {
		HeadChefDao hc = (HeadChefDao) hdao.save(HeadChef);
		if (hc != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteHeadChef(Integer hcId) {
		hdao.deleteById(hcId);
		return true;
	}


}
