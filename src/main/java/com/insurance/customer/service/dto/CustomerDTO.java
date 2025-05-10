package com.insurance.customer.service.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

	private Long id;
    private String name;
    private String email;
    private String phone;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    
}
