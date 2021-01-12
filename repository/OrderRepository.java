package com.sierraclass.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sierraclass.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
