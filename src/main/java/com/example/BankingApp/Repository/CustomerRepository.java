package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Customer.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

}
