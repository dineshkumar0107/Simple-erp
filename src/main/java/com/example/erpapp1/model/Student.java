package com.example.erpapp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Getter
//@Setter
@AllArgsConstructor
@Data
public class Student {
    private int rollNumber;
    private String name;
    private String gender;
    private List<Double> marks; //5 subject
    private String city;




    }

