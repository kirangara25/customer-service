package com.insurance.customer.service.service;

import java.util.List;

import com.insurance.customer.service.dto.CustomerDTO;
import com.insurance.customer.service.exception.CustomerNotFoundException;
public interface CustomerService {

	CustomerDTO create(CustomerDTO customerDto);
	
	CustomerDTO getById(Long id);
	
    List<CustomerDTO> getAll();
    
    CustomerDTO update(Long id, CustomerDTO dto);
    
    void delete(Long id);

}