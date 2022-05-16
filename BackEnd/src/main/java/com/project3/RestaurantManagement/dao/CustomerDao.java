/**
 * 
 */
package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project3.RestaurantManagement.entity.Customer;

/**
 * @author Sagnik & Venkatesh
 *
 */
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	@Query(value="select * from Customer c where c.c_email=?1 and c.c_password=?2",nativeQuery=true)
	int verifyCredentials(String email, String password);

}
