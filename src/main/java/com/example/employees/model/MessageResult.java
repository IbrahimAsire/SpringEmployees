package com.example.employees.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class MessageResult {
    private String message;
    private Integer status;
}
