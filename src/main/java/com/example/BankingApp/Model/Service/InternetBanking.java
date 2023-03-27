package com.example.BankingApp.Model.Service;


import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class InternetBanking {
    @Id
    private Long id;
    @Embedded
    private OnlineTransaction onlineTransaction;
    @Embedded
    private BillPay billPay;
    @Embedded
    private Insurance insurance;

    // constructors, getters and setters
}
