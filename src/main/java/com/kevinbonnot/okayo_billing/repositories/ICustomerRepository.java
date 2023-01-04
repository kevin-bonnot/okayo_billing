package com.kevinbonnot.okayo_billing.repositories;

import com.kevinbonnot.okayo_billing.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
