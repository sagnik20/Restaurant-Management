/**
 * 
 */
package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.RestaurantManagement.entity.Orders;

/**
 * @author Sagnik
 *
 */
public interface OrderDao extends JpaRepository<Orders, Integer> {

}
