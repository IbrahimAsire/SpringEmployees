package com.example.employees.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor @Data
public class Employee {

    @NotEmpty(message = "Id is empty!")
    private String ID;
    @NotEmpty(message = "Name is empty!")
    private String name;
    @NotNull(message = "Age is empty!")
    private Integer age;
    @NotNull(message = "Slary is empty!")
    private Double salary;

}
