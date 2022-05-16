/**
 * 
 */
package com.project3.RestaurantManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.entity.Supervisor;
import com.project3.RestaurantManagement.service.RestaurantServiceInf;

/**
 * @author everyone
 *
 */

@RestController
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
	@RequestMapping(path = "/addChef")
	
	public String addChef(@RequestBody HeadChef chef) {
		boolean flag=service.addChef(chef);
		if(flag){
			return "Chef Added Successfully";
		}else {
			return "An error occured while saving the Chef details";
		}
	}
	//Getting chef details
	@RequestMapping(path = "/getChef")
	public List<HeadChef> getHeadChef(){
		return service.getChef();
	}
	
	//deleting chef
	@RequestMapping(path="deleteChef")
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
	@RequestMapping(path = "addSupervisor")
	public String addSupervisor(@RequestBody Supervisor supervisor) {
		boolean flag=service.addSupervisor(supervisor);
		if(flag){
			return "Supervisor Added Successfully";
		}else {
			return "An error occured while saving the supervisor details";
		}
	}
	//getting supervisor
	@RequestMapping(path = "getSupervisors")
	public List<Supervisor> getSuperviors(){
		return service.getSupervisors();
	}
	
	
	//Deleting Supervisor
	@RequestMapping(path = "deleteSupervisor")
	public String deleteSupervisor(@RequestBody Integer sId) {
		boolean flag=service.deleteSupervisor(sId);
		if(flag) {
			return "Supervisor details deleted successfully";
		}else {
			return "Error while deleting Supervisor details";
		}
	}
}
