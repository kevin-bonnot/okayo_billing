package com.kevinbonnot.okayo_billing.repositories;

import com.kevinbonnot.okayo_billing.entities.Bill;
import org.springframework.data.repository.CrudRepository;

public interface IBillRepository extends CrudRepository<Bill, Long> {
}
