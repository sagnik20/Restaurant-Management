package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project3.RestaurantManagement.entity.HeadChef;

/**
 * @author Venkatesh
 *
 */
@Repository
public interface HeadChefDao  extends JpaRepository<HeadChef,Integer>{

	@Query(value="select count(*) from HeadChef s where s.c_email=?1 and s.c_password=?2",nativeQuery = true)
	int verifyCredentials(String email,String password);

	
	@Query(value = "select * from HeadChef a where a.c_email = ?1 and a.c_password = ?2", nativeQuery = true)
	HeadChef findByEmailAndPass(String email,String pass);

	
}
