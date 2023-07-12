package com.jpaappllication.repository;

import com.jpaappllication.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface ProductRepository extends CrudRepository<Product, Serializable> {

}
