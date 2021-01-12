package com.sierraclass.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sierraclass.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
