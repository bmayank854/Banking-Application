package com.example.BankingApp.Controller;

import com.example.BankingApp.Model.Service.LoanEntity;
import com.example.BankingApp.Model.Service.LockerEntity;
import com.example.BankingApp.Service.LoanService;
import com.example.BankingApp.Service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping("/loans")
    public LoanEntity createLoan(@RequestBody LoanEntity loan) {
        return loanService.saveLoan(loan);
    }

    @GetMapping("/loans/{id}")
    public Optional<LoanEntity> getLoan(@PathVariable Long id) {
        return loanService.getLoan(id);
    }

    @GetMapping("/loans")
    public List<LoanEntity> getAllLoans() {
        return loanService.getAllLoans();
    }
}
