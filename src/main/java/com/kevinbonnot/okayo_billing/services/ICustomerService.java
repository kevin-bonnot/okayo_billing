package com.kevinbonnot.okayo_billing.services;

import com.kevinbonnot.okayo_billing.entities.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> getCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    void deleteCustomer(long id);
}
