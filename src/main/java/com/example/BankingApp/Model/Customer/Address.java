package com.example.BankingApp.Model.Customer;

import com.example.BankingApp.Model.Customer.CustomerEntity;
import com.example.BankingApp.Model.Employee.EmployeeEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {


    private String StreetAdress;

    private String City;

    private String State;

    private String Pincode;

}
