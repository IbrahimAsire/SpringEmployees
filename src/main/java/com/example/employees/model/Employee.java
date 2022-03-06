package com.example.employees.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
public class Employee {

    @NotEmpty(message = "Id is empty!")
    private String ID;
    @NotEmpty(message = "Name is empty!")
    private String name;
    @NotEmpty(message = "Age is empty!")
    private Integer age;
    @NotEmpty(message = "Slary is empty!")
    private Double salary;

}
