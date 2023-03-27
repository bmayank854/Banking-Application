package com.example.BankingApp.Model.Service;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Embeddable
@Entity

public class BillPay {
    private String typeOfBill;
    @Id
    private int billNum;
    private int amountToPay;
    private int transactionId;
}
