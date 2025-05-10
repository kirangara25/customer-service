package com.insurance.customer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.customer.service.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
