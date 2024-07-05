package com.sunbeam.mobile.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.mobile.entities.Order;
import com.sunbeam.mobile.entities.User;

public interface OrderDao extends JpaRepository<Order,Integer> {

}
