package com.example.BankingApp.Controller;

import com.example.BankingApp.Model.Service.LockerEntity;
import com.example.BankingApp.Service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class LockerController {
    @Autowired
    private LockerService lockerService;

    @PostMapping("/lockers")
    public LockerEntity createLocker(@RequestBody LockerEntity locker) {
        return lockerService.saveLocker(locker);
    }

    @GetMapping("/lockers/{id}")
    public Optional<LockerEntity> getLocker(@PathVariable Long id) {
        return lockerService.getLockerById(id);
    }

    @GetMapping("/lockers")
    public List<LockerEntity> getAllLockers() {
        return lockerService.getAllLockers();
    }
}
