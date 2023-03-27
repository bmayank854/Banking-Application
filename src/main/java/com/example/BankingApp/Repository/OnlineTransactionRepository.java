package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Service.OnlineTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineTransactionRepository extends JpaRepository<OnlineTransaction,Long> {
}
