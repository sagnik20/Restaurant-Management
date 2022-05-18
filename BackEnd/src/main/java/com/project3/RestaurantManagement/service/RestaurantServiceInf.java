/**
 * 
 */
package com.project3.RestaurantManagement.service;

import java.util.List;

import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.EntityInterface;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.entity.Item;
import com.project3.RestaurantManagement.entity.Orders;
import com.project3.RestaurantManagement.entity.Supervisor;

/**
 * @author Sagnik 
 * @author Venkatesh
 *
 */
public interface RestaurantServiceInf {

	public EntityInterface LoginService(LoginHelper loginHelp);

	public boolean deleteSupervisor(Integer sId);
	public List<Supervisor> getSupervisors();
	public boolean addSupervisor(Supervisor supervisor);


	public boolean addChef(HeadChef chef);
	public List<HeadChef> getChef();
	public boolean deleteChef(Integer cId);
	
	public boolean additem(Item item);
	public boolean deleteItem(Item item);
	
	public boolean addAdmin(Admin admin);
	
	public List<Item> getItem();
	public void served(int oId);
	public List<Orders> allOrders();
	public void modify(int iId);
}
