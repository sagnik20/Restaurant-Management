package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project3.RestaurantManagement.entity.Supervisor;

/**
 * @author Venkatesh
 *
 */

@Repository
public interface SupervisorDao extends JpaRepository<Supervisor,Integer>{
	@Query(value="select count(*) from Supervisor s where s.s_email=?1 and s.s_password=?2",nativeQuery = true)
	int verifyCredentials(String email,String password);

	@Query(value = "select * from Supervisor a where a.s_email = ?1 and a.s_password = ?2", nativeQuery = true)
	Supervisor findByEmailAndPass(String email, String pass);
	


}
