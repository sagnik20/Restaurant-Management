/**
 * 
 */
package com.project3.RestaurantManagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.entity.Item;
import com.project3.RestaurantManagement.entity.Orders;
import com.project3.RestaurantManagement.entity.Supervisor;
import com.project3.RestaurantManagement.service.RestaurantServiceInf;

/**
 * @author Sagnik
 * @author Venkatesh
 * @author Sudarsan
 * @author Runval
 * 
 */

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantController {

	@Autowired
	RestaurantServiceInf service;
	//Admin Login 
	@RequestMapping(path="/adminLogin")
	public Admin AdminLogin(@RequestBody LoginHelper loginHelp) {
		return (Admin)service.LoginService(loginHelp);
	}
	//HeadChef Login
	@RequestMapping(path="/HeadCheflogin")
	public HeadChef ChefLogin(@RequestBody LoginHelper loginHelper) {
//		System.out.println(loginHelper);

		HeadChef chef=(HeadChef)service.LoginService(loginHelper);
		return chef;
		
	}
	//Supervisor Login
	@RequestMapping(path="/supervisorlogin")
	public Supervisor SupervisorLogin(@RequestBody LoginHelper loginHelper) {
//		System.out.println(loginHelper);

		Supervisor supervisor=(Supervisor)service.LoginService(loginHelper);
		return supervisor;
		
	}
	
	//Adding New Chef
	
	@PostMapping("/addchef")
	//@CrossOrigin()
	@CrossOrigin(origins="http://localhost:4200")
	public String addChef(@RequestBody HeadChef chef) {
		boolean flag=service.addChef(chef);
		if(flag){
			return "New Chef "+ chef.getCName()+" Added Successfully";
		}else {
			return "An error occured while saving the Chef details";
		}
	}
	//Getting chef details
	@GetMapping(path = "/getlistofchefs")
	@CrossOrigin(origins="http://localhost:4200")
	public List<HeadChef> getlistofchef(){
		List<HeadChef> chefs= new ArrayList<HeadChef>();
		chefs=service.getChef();
		return chefs;
	}
	
	//deleting chef
	@DeleteMapping(path="/deleteChef")
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteChef(@RequestBody Integer cId) {
		boolean flag=service.deleteChef(cId);
		if(flag) {
			return "Chef details deleted successfully";
		}else {
			return "Error while deleting chef details";
		}
	}
	
	//Supervisor 
	//Adding Supervisor
	@RequestMapping(path = "/addSupervisor")
	public String addSupervisor(@RequestBody Supervisor supervisor) {
		boolean flag=service.addSupervisor(supervisor);
		if(flag){
			return "New Supervisor "+ supervisor.getSName() +" Added Successfully";
		}else {
			return "An error occured while saving the supervisor details";
		}
	}
	//getting supervisor
	@RequestMapping(path = "/getSupervisors")
	public List<Supervisor> getSuperviors(){
		return service.getSupervisors();
	}
	
	
	//Deleting Supervisor
	@RequestMapping(path = "/deleteSupervisor")
	public String deleteSupervisor(@RequestBody Integer sId) {
		boolean flag=service.deleteSupervisor(sId);
		if(flag) {
			return "Supervisor details deleted successfully";
		}else {
			return "Error while deleting Supervisor details";
		}
	}
	
	@PostMapping("/addAdmin")
	public String addAdmin(@RequestBody Admin admin) {
		boolean flag = service.addAdmin(admin);
		if(flag)
			return "New Admin "+ admin.getAName() + " added successfully";
		else
			return admin.getAName()+" couldn't be added. Error!";
	}
	
/******************* Start OF KITCHEN-CHEF REST CONTROLLER ****************/
	
	@GetMapping("/getOrders")
	
	public List<Orders> getAllOrders()
	{
		List<Orders> placedOrders = service.allOrders();
		return placedOrders;
	}
	
	@RequestMapping("/servedOrder/{oId}")
	public void servedOrder(@PathVariable int oId)
	{
		service.served(oId);
	}
	
	@GetMapping("/getAllItem")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Item> getAllItems()
	{
		List<Item> allItems = service.getItem();
		return allItems;	
	}
	
	@RequestMapping("/modifyItemStatus/{iId}")
	public void modifyItem(@PathVariable int iId)
	{
		service.modify(iId);
	}
	
	/******************* End OF KITCHEN-CHEF REST CONTROLLER ****************/
}
