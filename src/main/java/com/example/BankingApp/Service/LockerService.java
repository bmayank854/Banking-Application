package com.example.BankingApp.Service;

import com.example.BankingApp.Model.Service.LockerEntity;
import com.example.BankingApp.Repository.LockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LockerService {

    @Autowired
    private LockerRepository lockerRepository;

    public LockerEntity saveLocker(LockerEntity locker) {
        return lockerRepository.save(locker);
    }

    public List<LockerEntity> getAllLockers() {
        return lockerRepository.findAll();
    }

    public Optional<LockerEntity> getLockerById(Long lockerNum) {
        return lockerRepository.findById(lockerNum);
    }

    public void deleteLockerById(Long lockerNum) {
        lockerRepository.deleteById(lockerNum);
    }


}
