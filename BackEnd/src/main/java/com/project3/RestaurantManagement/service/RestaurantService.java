/**
 * 
 */
package com.project3.RestaurantManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project3.RestaurantManagement.dao.AdminDao;
import com.project3.RestaurantManagement.dao.CartDao;
import com.project3.RestaurantManagement.dao.CustomerDao;
import com.project3.RestaurantManagement.dao.HeadChefDao;
import com.project3.RestaurantManagement.dao.ItemDao;
import com.project3.RestaurantManagement.dao.OrderDao;
import com.project3.RestaurantManagement.dao.SupervisorDao;
import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.Customer;
import com.project3.RestaurantManagement.entity.EntityInterface;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.entity.Item;
import com.project3.RestaurantManagement.entity.Orders;
import com.project3.RestaurantManagement.entity.Supervisor;

/**
 * @author Sagnik 
 * @author Venkatesh
 * @author Sudarsan
 * @author Runval
 */

@Service
public class RestaurantService implements RestaurantServiceInf {
	
	@Autowired
	private AdminDao aDao;
	
	@Autowired
	private HeadChefDao hDao;
	
	@Autowired
	private SupervisorDao sDao;
	
	@Autowired
	private CustomerDao cDao;
	
	@Autowired
	private ItemDao iDao;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private OrderDao oDao;

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

			if (hDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				hc = hDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			
			return hc;
			
		}
		else if (loginHelp.getRole().equals("Supervisor")) {
			Supervisor sv = null;

			if (sDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword()) > 0) 
				sv = sDao.findByEmailAndPass(loginHelp.getEmail(),loginHelp.getPassword());
			
			return sv;

		}
		else {
			Customer customer =null;
			if(cDao.verifyCredentials(loginHelp.getEmail(), loginHelp.getPassword())>0)
				customer = cDao.findByEmailAndPass(loginHelp.getEmail(), loginHelp.getPassword());
			return customer;
		}
	}
	//HEAD CHEFF 
	//adding chef
	public boolean addChef(HeadChef chef) {
		HeadChef hc = hDao.save(chef);
		
		if (hc != null) {
			return true;
		} else {
			return false;
		}
	}
	//list  chefs
	public List<HeadChef> getChef() {
		List<HeadChef> chefs = hDao.findAll();
		return chefs;
	}
	
	//Deleting  chef
	public boolean deleteChef(Integer cId) {
		hDao.deleteById(cId);
		return true;
	}
	
	
	//SUPERVISOR
	
	//Adding supervisor 
	public boolean addSupervisor(Supervisor supervisor) {
		Supervisor superVisor = sDao.save(supervisor);
		if (superVisor != null) {
			return true;
		} else {
			return false;
		}
	}
	 
	//list of supervisors
	public List<Supervisor> getSupervisors() {
		List<Supervisor> supervisors = sDao.findAll();
		return supervisors;
	}
	
	//deleting supervisor
	public boolean deleteSupervisor(Integer sId) {
		sDao.deleteById(sId);
		return true;
	}
	
	//Item Add
	public boolean additem(Item item) {
		Item saveitem = iDao.save(item);
		if(saveitem != null)
			return true;
		return false;
	}
	//get Item 
	public List<Item> getItem() {
		return iDao.findAll();
	}
	
	//Delete Item
	public boolean deleteItem(Item item) {
		iDao.delete(item);
		return true;
	}
	
	public boolean addAdmin(Admin admin) {
		Admin saveAdm = aDao.save(admin);
		if(saveAdm!=null)
			return true;
		return false;
	}
	
	//Getting All Orders Which Placed By Customer
		@Override
		public List<Orders> allOrders() {
			return oDao.findAll();
		}
		
		//Orders served delivered to customer
		@Override
		public void served(int oId) {
			Optional<Orders> getOrder = oDao.findById(oId);
			getOrder.get().setOrderstatus(0);	
			oDao.save(getOrder.get());
		}
		
		@Override
		public void modify(int iId) {
			Optional<Item> getItem = iDao.findById(iId);
			getItem.get().setStatus(false);
			iDao.save(getItem.get());
		}
		
}
