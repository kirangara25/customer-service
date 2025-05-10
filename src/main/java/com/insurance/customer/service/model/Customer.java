package com.insurance.customer.service.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id @GeneratedValue
	private Long id;
    private String name;
    private String email;
    private String phone;
    
    @Column(name = "date_of_birth", columnDefinition = "DATE")
    private LocalDate dateOfBirth;

}
