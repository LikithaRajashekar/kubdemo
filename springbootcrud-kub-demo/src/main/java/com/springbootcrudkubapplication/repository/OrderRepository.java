package com.springbootcrudkubapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrudkubapplication.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
