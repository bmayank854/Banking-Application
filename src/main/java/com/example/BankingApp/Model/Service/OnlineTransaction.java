package com.example.BankingApp.Model.Service;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Embeddable
@Entity
public class OnlineTransaction {


    @Id
    private int customerAccNum;
    private int benificiaryAccNum;
    private int isfcCode;
    private int amountToTransfer;
}
