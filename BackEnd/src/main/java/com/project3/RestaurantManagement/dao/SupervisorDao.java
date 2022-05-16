package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project3.RestaurantManagement.entity.Supervisor;



@Repository
public interface SupervisorDao extends JpaRepository<Supervisor,Integer>{
	@Query(value="select count(*) from Supervisor s where s.semail=?1 and s.spassword=?2",nativeQuery = true)
	int verifyCredentials(String email,String password);

	Supervisor findByEmailAndPass(String email, String pass);
	


}
