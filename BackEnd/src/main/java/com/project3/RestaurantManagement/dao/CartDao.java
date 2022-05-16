/**
 * 
 */
package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.RestaurantManagement.entity.Cart;

/**
 * @author Sagnik
 *
 */
public interface CartDao extends JpaRepository<Cart, Integer> {

}
