package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Service.InternetBanking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternetBankingRepository extends JpaRepository<InternetBanking, Long> {
}
