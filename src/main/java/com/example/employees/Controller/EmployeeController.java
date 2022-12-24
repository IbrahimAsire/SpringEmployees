package com.example.employees.Controller;

import com.example.employees.model.Employee;
import com.example.employees.model.MessageResult;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
//should be review this
@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

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
            return ResponseEntity.status(201).body(new MessageResult("add employee", 201));
        }
    }

    @PutMapping("employee/{index}")
    public ResponseEntity updateEmployee(@PathVariable Integer index, @RequestBody Employee employee){
        employees.set(index, employee);
        return ResponseEntity.status(200).body(new MessageResult("update employee", 200));
    }

    @DeleteMapping("employee/{index}")
    public ResponseEntity deleteEmployee(@PathVariable Integer index){
        employees.remove(index);
        return ResponseEntity.status(200).body(new MessageResult("delete employee!", 200));
    }

    @GetMapping("employee/salary")
    public ResponseEntity<MessageResult> totalSalary(){
        Integer total = 0;

        for(int i = 0; i > employees.size(); i++){
            total += i;
            return ResponseEntity.status(200).body(new MessageResult("the total salary is :"+total, 200));
        }
        return ResponseEntity.status(200).body(new MessageResult("the total salary is :"+total, 200));
    }
}
