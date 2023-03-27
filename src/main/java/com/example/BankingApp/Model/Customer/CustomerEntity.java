package com.example.BankingApp.Model.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor

public class CustomerEntity {

    @Id
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_acc_num")
    private Long customerAccNum;

    @Embedded
    private BranchDetails branchDetails;

    @Column(name = "customer_acc_type")
    private String customerAccType;

    @Column(name = "customer_concat_num")
    private String customerConcatNum;

    @Embedded
    private CreditCard creditCard;

    @Column(name = "customer_pancard_num")
    private Long customerPancardNum;

    @Embedded
    private Address address;


}