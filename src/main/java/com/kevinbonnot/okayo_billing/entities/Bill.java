package com.kevinbonnot.okayo_billing.entities;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Date billingDate;
    @Column(nullable = false)
    private Date dueDate;
    @Column
    private boolean isPayed = false;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customer;

    public Bill() {
    }

    public Bill(Long id, Date billingDate, Date dueDate, boolean isPayed, Customer customer) {
        this.id = id;
        this.billingDate = billingDate;
        this.dueDate = dueDate;
        this.isPayed = isPayed;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
