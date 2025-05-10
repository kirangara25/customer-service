package com.insurance.customer.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.customer.service.dto.CustomerDTO;
import com.insurance.customer.service.service.CustomerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

		@Autowired
	 	private CustomerService service;

	    @PostMapping
	    public ResponseEntity<CustomerDTO> create(@RequestBody @Valid CustomerDTO dto) {
	        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<CustomerDTO> get(@PathVariable Long id) {
	        return ResponseEntity.ok(service.getById(id));
	    }

	    @GetMapping
	    public List<CustomerDTO> getAll() {
	        return service.getAll();
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<CustomerDTO> update(@PathVariable Long id, @RequestBody @Valid CustomerDTO dto) {
	        return ResponseEntity.ok(service.update(id, dto));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	        service.delete(id);
	        return ResponseEntity.noContent().build();
	    }
	
}
