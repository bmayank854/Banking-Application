package com.example.BankingApp.Model.Service;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class LockerEntity {
    @Id
    private int lockerNum;
    private int customerAccNum;
    private int branchNum;
}