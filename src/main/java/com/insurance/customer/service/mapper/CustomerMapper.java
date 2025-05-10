package com.insurance.customer.service.mapper;

import org.mapstruct.Mapper;

import com.insurance.customer.service.dto.CustomerDTO;
import com.insurance.customer.service.model.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	Customer toEntity(CustomerDTO dto);
	
    CustomerDTO toDto(Customer entity);
}
