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
public interface AdminDao extends JpaRepository<Admin, Integer>{

	@Query(value = "select count(*) from Admin a where a.a_email = ?1 and a.a_password = ?2", nativeQuery = true)
	int verifyCredentials(String email,String password);

	@Query(value = "select * from Admin a where a.a_email = ?1 and a.a_password = ?2", nativeQuery = true)
	Admin findByEmailAndPass(String email,String pass);
}
