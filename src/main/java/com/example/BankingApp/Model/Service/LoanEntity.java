package com.example.BankingApp.Model.Service;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class LoanEntity {
    @Id
    private int loanNumber;
    private int customerId;
    private int loanAmount;
}