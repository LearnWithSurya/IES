package com.jpaappllication.repository;

import com.jpaappllication.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface EmpRepository extends CrudRepository<Employee, Serializable> {

}
