package com.example.customer.service;

import com.example.customer.model.Customer;

import java.util.List;

public interface CustomerService {
   public Customer addCustomer(Customer customer);



    public  List<Customer> addAllCustomer(List<Customer> customers);

    public Customer getCustomer(int id);

    public Customer updateCustomer(Customer customer, int id);

   public List<Customer> getAllCutstomer();
}
