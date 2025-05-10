package com.insurance.customer.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.customer.service.dto.CustomerDTO;
import com.insurance.customer.service.exception.CustomerNotFoundException;
import com.insurance.customer.service.mapper.CustomerMapper;
import com.insurance.customer.service.model.Customer;
import com.insurance.customer.service.repository.CustomerRepository;
import com.insurance.customer.service.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;

	@Autowired
	CustomerMapper mapper;
	
	@Override
    public CustomerDTO create(CustomerDTO dto) {
        Customer entity = mapper.toEntity(dto);
        return mapper.toDto(repo.save(entity));
    }

    @Override
    public CustomerDTO getById(Long id) {
        Customer entity = repo.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
        return mapper.toDto(entity);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public CustomerDTO update(Long id, CustomerDTO dto) {
        Customer existing = repo.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setPhone(dto.getPhone());
        existing.setDateOfBirth(dto.getDateOfBirth());
        return mapper.toDto(repo.save(existing));
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
