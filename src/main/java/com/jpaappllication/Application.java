package com.jpaappllication;

import com.jpaappllication.entity.Employee;
import com.jpaappllication.entity.Product;
import com.jpaappllication.repository.EmpRepository;
import com.jpaappllication.repository.Order;
import com.jpaappllication.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		System.out.println("Impl class::" + empRepository.getClass().getName());
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Surya");
		emp.setEmpSal(20000.00);
		empRepository.save(emp);
		System.out.println("+++++++++++++Employee Record saved");
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Product prd = new Product();
		prd.setProductId(463773);
		prd.setProductName("Ashribad Wheat");
		prd.setProductPrice(145.00);
		productRepository.save(prd);
		System.out.println("###########Product Record saved");
		Order order = context.getBean(Order.class);
		int i=20;
		int j=30;
	}

}
