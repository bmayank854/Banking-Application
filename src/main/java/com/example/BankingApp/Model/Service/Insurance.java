package com.example.BankingApp.Model.Service;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Embeddable
@Entity
public class Insurance {
    @Id
    private int insuranceId;
    private String typeOfInsurance;
    private int insuranceAmount;
    private int insuranceAccNum;
    private String insuranceValidity;

}
