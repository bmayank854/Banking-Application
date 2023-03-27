package com.example.BankingApp.Model.Customer;

import com.example.BankingApp.Model.Customer.CustomerEntity;
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
public class BranchDetails {
    private String branchName;


    private Long branchCode;

    private String branchIfscCode;



    // getters and setters
}
