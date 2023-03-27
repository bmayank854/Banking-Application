package com.example.BankingApp.Model.Employee;

import com.example.BankingApp.Model.Customer.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    private Long employeeId;

    private String employeeName;

    private double employeeSalary;

    private String employeeTitle;

    @Embedded
    private Address employeeAddress;

    private LocalDate employeeJoiningDate;
}