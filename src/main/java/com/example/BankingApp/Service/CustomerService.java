package com.example.BankingApp.Service;

import com.example.BankingApp.Model.Customer.CustomerEntity;
import com.example.BankingApp.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(CustomerEntity customer) {
        customerRepository.save(customer);
    }

    public Optional<CustomerEntity> getCustomer(Long customerId) {
        return customerRepository.findById(customerId);
    }

    public void deleteCustomer(Long customerId) {
        Optional<CustomerEntity> customer = customerRepository.findById(customerId);
        if (customer != null) {
            customerRepository.delete(new CustomerEntity());
        }
    }
}