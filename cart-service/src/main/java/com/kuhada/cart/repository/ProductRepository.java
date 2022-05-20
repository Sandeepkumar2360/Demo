package com.kuhada.cart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kuhada.cart.entity.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
