package com.kevinbonnot.okayo_billing.controllers;

import com.kevinbonnot.okayo_billing.entities.Bill;
import com.kevinbonnot.okayo_billing.services.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    IBillService billService;

    @GetMapping("")
    public Iterable<Bill> index() {
        return billService.getBills();
    }

    @GetMapping("/{id}")
    public Optional<Bill> getBillById(@PathVariable Long id) {
        // TODO: Return 404 when null
        return billService.getBillById(id);
    }

    @PostMapping("")
    public Bill saveBill(Bill bill) {
        // TODO: manage null error
        return billService.saveBill(bill);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
    }
}
