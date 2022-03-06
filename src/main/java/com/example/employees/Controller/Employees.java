package com.example.employees.Controller;

import com.example.employees.model.Employee;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/")
public class Employees {

    ArrayList<Employee> employees=new ArrayList<>();

    @GetMapping("employee")
    public ResponseEntity getEmployees(){
        return ResponseEntity.status(200).body(employees);
    }

    @PostMapping("employee")
    public ResponseEntity addEmployee(@RequestBody @Valid Employee employee, Errors errors){
        if(errors.hasErrors()){
            return ResponseEntity.status(400).body(errors.getFieldError());
        }else{
            employees.add(employee);
            return ResponseEntity.status(201).body("create employee");
        }
    }


}
