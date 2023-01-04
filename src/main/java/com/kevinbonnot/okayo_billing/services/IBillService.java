package com.kevinbonnot.okayo_billing.services;

import com.kevinbonnot.okayo_billing.entities.Bill;

import java.util.Optional;

public interface IBillService {
    Iterable<Bill> getBills();
    Optional<Bill> getBillById(Long id);
    Bill saveBill(Bill bill);
    void deleteBill(long id);
}
