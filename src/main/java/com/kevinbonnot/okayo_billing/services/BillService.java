package com.kevinbonnot.okayo_billing.services;

import com.kevinbonnot.okayo_billing.entities.Bill;
import com.kevinbonnot.okayo_billing.repositories.IBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillService implements IBillService {
    @Autowired
    IBillRepository billRepository;

    @Override
    public Iterable<Bill> getBills() {
        return billRepository.findAll();
    }

    @Override
    public Optional<Bill> getBillById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public void deleteBill(long id) {
        billRepository.deleteById(id);
    }
}
