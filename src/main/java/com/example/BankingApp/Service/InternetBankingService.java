package com.example.BankingApp.Service;

import com.example.BankingApp.Model.Service.BillPay;
import com.example.BankingApp.Model.Service.Insurance;
import com.example.BankingApp.Model.Service.OnlineTransaction;
import com.example.BankingApp.Repository.BillPayRepository;
import com.example.BankingApp.Repository.InsuranceRepository;
import com.example.BankingApp.Repository.OnlineTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternetBankingService {

    @Autowired
    private OnlineTransactionRepository onlineTransactionRepository;

    @Autowired
    private BillPayRepository billPayRepository;

    @Autowired
    private InsuranceRepository insuranceRepository;

    public OnlineTransaction addOnlineTransaction(OnlineTransaction onlineTransaction) {
        return onlineTransactionRepository.save(onlineTransaction);
    }

    public BillPay addBillPay(BillPay billPay) {
        return billPayRepository.save(billPay);
    }

    public Insurance addInsurance(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    public Optional<OnlineTransaction> getOnlineTransactionById(Long id) {
        return onlineTransactionRepository.findById(id);
    }

    public Optional<BillPay> getBillPayById(Long id) {
        return billPayRepository.findById(id);
    }

    public Optional<Insurance> getInsuranceById(Long id) {
        return insuranceRepository.findById(id);
    }

    public List<OnlineTransaction> getAllOnlineTransactions() {
        return onlineTransactionRepository.findAll();
    }

    public List<BillPay> getAllBillPays() {
        return billPayRepository.findAll();
    }

    public List<Insurance> getAllInsurances() {
        return insuranceRepository.findAll();
    }

    public void deleteOnlineTransactionById(Long id) {
        onlineTransactionRepository.deleteById(id);
    }

    public void deleteBillPayById(Long id) {
        billPayRepository.deleteById(id);
    }

    public void deleteInsuranceById(Long id) {
        insuranceRepository.deleteById(id);
    }


    public BillPay createBillPay(BillPay billPay) {
        billPayRepository.save(billPay);
        return billPay;
    }

    /*public Insurance createInsurance(Insurance insurance) {
        InsuranceRepository.save(insurance);
        return  insurance;
    }*/
}
