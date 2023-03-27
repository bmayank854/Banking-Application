package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Service.BillPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillPayRepository extends JpaRepository<BillPay,Long> {
}
