package com.jpaappllication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Order extends JpaRepository<Order, Serializable> {
}
