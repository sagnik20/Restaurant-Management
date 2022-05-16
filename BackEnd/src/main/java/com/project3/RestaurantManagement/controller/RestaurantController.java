/**
 * 
 */
package com.project3.RestaurantManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project3.RestaurantManagement.dto.LoginHelper;
import com.project3.RestaurantManagement.entity.Admin;
import com.project3.RestaurantManagement.entity.HeadChef;
import com.project3.RestaurantManagement.service.RestaurantServiceInf;

/**
 * @author everyone
 *
 */

@RestController
public class RestaurantController {

	@Autowired
	RestaurantServiceInf service;
	
	@RequestMapping(path="/adminLogin")
	public Admin AdminLogin(@RequestBody LoginHelper loginHelp) {
		return (Admin)service.LoginService(loginHelp);
	}
	
	@RequestMapping(path = "/addHeadChef")
	public String addSupervisor(@RequestBody HeadChef HeadChef) {
		boolean flag=service.addHeadChef(HeadChef);
		if(flag){
			return "HeadChef Added Successfully";
		}else {
			return "An error occured while saving the HeadChef details";
		}
	}
}
