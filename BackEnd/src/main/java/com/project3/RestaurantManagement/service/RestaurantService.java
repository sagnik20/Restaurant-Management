/**
 * 
 */
package com.project3.RestaurantManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project3.RestaurantManagement.dao.AdminDao;
import com.project3.RestaurantManagement.dao.HeadChefDao;
import com.project3.RestaurantManagement.dao.SupervisorDao;
import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.EntityInterface;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.entity.Supervisor;

/**
 * @author Sagnik 
 * @author Venkatesh
 *
 */

@Service
public class RestaurantService implements RestaurantServiceInf {
	
	@Autowired
	private AdminDao aDao;
	@Autowired
	private HeadChefDao hdao;
	
	@Autowired
	private SupervisorDao sdao;

	@Override
	public EntityInterface LoginService(LoginHelper loginHelp) {
		
	
		if(loginHelp.getRole().equals("admin")) {
			Admin admin=null;
			if(aDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0)
				admin = aDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			return admin;
		}
		else if (loginHelp.getRole().equals("HeadChef")) {

			HeadChef hc = null;

			if (hdao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				hc = hdao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			
			return hc;
			
		}
		else if (loginHelp.getRole().equals("Supervisor")) {
			Supervisor sv = null;

			if (sdao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				sv = sdao.findByEmailAndPass(loginHelp.getEmail(),loginHelp.getPassword());
			
			return sv;

		}
		
		return null;
	}
	//HEAD CHEFF 
	//adding chef
	public boolean addChef(HeadChef chef) {
		HeadChef hc = hdao.save(chef);
		
		if (hc != null) {
			return true;
		} else {
			return false;
		}
	}
	//list  chefs
	public List<HeadChef> getChef() {
		List<HeadChef> chefs = hdao.findAll();
		return chefs;
	}
	
	//Deleting  chef
	public boolean deleteChef(Integer cId) {
		hdao.deleteById(cId);
		return true;
	}
	
	
	//SUPERVISOR
	
	//Adding supervisor 
	public boolean addSupervisor(Supervisor supervisor) {
		Supervisor superVisor = sdao.save(supervisor);
		if (superVisor != null) {
			return true;
		} else {
			return false;
		}
	}
	 
	//list of supervisors
	public List<Supervisor> getSupervisors() {
		List<Supervisor> supervisors = sdao.findAll();
		return supervisors;
	}
	
	//deleting supervisor
	public boolean deleteSupervisor(Integer sId) {
		sdao.deleteById(sId);
		return true;
	}
	
	
	
	
	
}
