package com.kevinbonnot.okayo_billing.controllers;

import com.kevinbonnot.okayo_billing.entities.Customer;
import com.kevinbonnot.okayo_billing.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// TODO: Add update

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @GetMapping("")
    public Iterable<Customer> index() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        // TODO: Return 404 when null
        return customerService.getCustomerById(id);
    }

    @PostMapping("")
    public Customer saveCustomer(Customer customer) {
        // TODO: manage null error
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        customerService.saveCustomer(new Customer(
                null,
                "azerty",
                "Un certain client",
                "1 rue de la république",
                "75001",
                "Paris"
        ));
    }
}
