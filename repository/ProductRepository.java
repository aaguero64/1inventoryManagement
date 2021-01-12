package com.sierraclass.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sierraclass.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
