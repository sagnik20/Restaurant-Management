package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project3.RestaurantManagement.entity.HeadChef;

@Repository
public interface HeadChefDao  extends JpaRepository<HeadChef,Integer>{

	@Query(value="select count(*) from Supervisor s where s.semail=?1 and s.spassword=?2",nativeQuery = true)
	int verifyCredentials(String email,String password);

	//HeadChefDao save(HeadChefDao headChef);


	
	
	
}
