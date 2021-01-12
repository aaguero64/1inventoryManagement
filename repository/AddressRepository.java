package com.sierraclass.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sierraclass.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
