package com.oce.springboot.training.d02.s05.repository;

import com.oce.springboot.training.d02.s05.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
