package com.example.BankingApp.Service;

import com.example.BankingApp.Model.Employee.EmployeeEntity;
import com.example.BankingApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity addEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeEntity getEmployeeById(Long employeeId) throws Exception {
        Optional<EmployeeEntity> employeeOptional = employeeRepository.findById(employeeId);
        if (((Optional<?>) employeeOptional).isPresent()) {
            return employeeOptional.get();
        } else {
            throw new Exception("Employee not found with id: " + employeeId);
        }
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity updateEmployee(Long employeeId, EmployeeEntity employee) throws Exception {
        Optional<EmployeeEntity> employeeOptional = employeeRepository.findById(employeeId);
        if (employeeOptional.isPresent()) {
            EmployeeEntity existingEmployee = employeeOptional.get();
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setEmployeeSalary(employee.getEmployeeSalary());
            existingEmployee.setEmployeeTitle(employee.getEmployeeTitle());
            existingEmployee.setEmployeeAddress(employee.getEmployeeAddress());
            existingEmployee.setEmployeeJoiningDate(employee.getEmployeeJoiningDate());
            return employeeRepository.save(existingEmployee);
        } else {
            throw new Exception("Employee not found with id: " + employeeId);
        }
    }

    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
