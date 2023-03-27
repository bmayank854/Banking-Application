package com.example.BankingApp.Repository;

import com.example.BankingApp.Model.Service.LockerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository<LockerEntity, Long> {
}
