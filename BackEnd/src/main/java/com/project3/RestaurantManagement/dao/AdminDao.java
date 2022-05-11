/**
 * 
 */
package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project3.RestaurantManagement.entity.Admin;

/**
 * @author sagnik
 *
 */
public interface AdminDao extends JpaRepository<Admin, String>{

	@Query(value = "select count(*) from Admin a where a.email = ?1 and a.pass = ?2, nativeQuery = true")
	int verifyCredentials(String email,String password);
}
