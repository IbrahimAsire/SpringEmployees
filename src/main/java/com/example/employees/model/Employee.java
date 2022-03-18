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
<<<<<<< HEAD
    @NotNull(message = "Slary is empty!")
||||||| b83bf47
    @NotEmpty(message = "Slary is empty!")
=======
    @NotNull(message = "Salary is empty!")
>>>>>>> ebd1f8aab8eab6e7d64e6a7fe4f4e9b5d0ecda9e
    private Double salary;

}
