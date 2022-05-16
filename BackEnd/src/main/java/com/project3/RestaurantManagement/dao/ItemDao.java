/**
 * 
 */
package com.project3.RestaurantManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.RestaurantManagement.entity.Item;

/**
 * @author Sagnik
 *
 */
public interface ItemDao extends JpaRepository<Item, Integer> {

}
