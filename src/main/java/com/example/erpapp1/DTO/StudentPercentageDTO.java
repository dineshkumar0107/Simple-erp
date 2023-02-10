package com.example.erpapp1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentPercentageDTO {
    private int rollNo;
    private String name;
    private double percentage;

}
