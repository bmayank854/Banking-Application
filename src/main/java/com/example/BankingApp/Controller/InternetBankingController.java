package com.example.BankingApp.Controller;

import com.example.BankingApp.Model.Service.BillPay;
import com.example.BankingApp.Model.Service.Insurance;
import com.example.BankingApp.Model.Service.OnlineTransaction;
import com.example.BankingApp.Service.InternetBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.util.Optional;

@RestController
@RequestMapping("/internet-banking")
public class InternetBankingController {

    @Autowired
    private InternetBankingService internetBankingService;

    @GetMapping("/onlinetransaction/{id}")
    public ResponseEntity<OnlineTransaction> getOnlineTransaction(@PathVariable("id") Long id) {
        Optional<OnlineTransaction> onlineTransaction = internetBankingService.getOnlineTransactionById(id);
        if (!onlineTransaction.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(onlineTransaction.get(), HttpStatus.OK);
    }

    @PostMapping("/onlinetransaction")
    public ResponseEntity<OnlineTransaction> addOnlineTransaction(@RequestBody OnlineTransaction onlineTransaction) {
        internetBankingService.addOnlineTransaction(onlineTransaction);
        return new ResponseEntity<>(onlineTransaction, HttpStatus.CREATED);
    }


    @PostMapping("/bill-pay")
    public ResponseEntity<BillPay> createBillPay(@RequestBody BillPay billPay) {
        BillPay newBillPay = internetBankingService.createBillPay(billPay);
        return ResponseEntity.ok().body(newBillPay);
    }

    // Endpoint for retrieving all bill payments
    @GetMapping("/bill-pay")
    public ResponseEntity<List<BillPay>> getAllBillPays() {
        List<BillPay> billPays = internetBankingService.getAllBillPays();
        return ResponseEntity.ok().body(billPays);
    }

    // Endpoint for retrieving a single bill payment by ID
    @GetMapping("/bill-pay/{id}")
    public ResponseEntity<Optional<BillPay>> getBillPayById(@PathVariable Long id) {
        Optional<BillPay> billPay = internetBankingService.getBillPayById(id);
        return ResponseEntity.ok().body(billPay);
    }



    // Endpoint for creating a new insurance policy
   /* @PostMapping("/insurance")
    public ResponseEntity<Insurance> createInsurance(@RequestBody Insurance insurance) {
        Insurance newInsurance = internetBankingService.createInsurance(insurance);
        return ResponseEntity.ok().body(newInsurance);
    }*/

    // Endpoint for retrieving all insurance policies


    // Endpoint for retrieving a single insurance policy by ID
    @GetMapping("/insurance/{id}")
    public ResponseEntity<Optional<Insurance>> getInsuranceById(@PathVariable Long id) {
        Optional<Insurance> insurance = internetBankingService.getInsuranceById(id);
        return ResponseEntity.ok().body(insurance);
    }






}
