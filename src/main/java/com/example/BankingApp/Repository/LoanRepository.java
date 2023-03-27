package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Service.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanEntity,Long> {
}
