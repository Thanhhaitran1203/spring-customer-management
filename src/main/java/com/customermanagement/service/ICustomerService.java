package com.customermanagement.service;

import com.customermanagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public void save(Customer customer);
    public Customer findById(int id);
    public void remove(int id);
}
