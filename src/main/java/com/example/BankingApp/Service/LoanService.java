package com.example.BankingApp.Service;

import com.example.BankingApp.Model.Service.LoanEntity;
import com.example.BankingApp.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public LoanEntity saveLoan(LoanEntity loan) {
        return loanRepository.save(loan);
    }

    public Optional<LoanEntity> getLoan(Long loanNumber) {
        return loanRepository.findById(loanNumber);
    }

    public List<LoanEntity> getAllLoans() {
        return loanRepository.findAll();
    }

    public void deleteLoan(Long loanNumber) {
        loanRepository.deleteById(loanNumber);
    }
}
