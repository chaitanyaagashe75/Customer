package com.example.customer.service.impl;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> addAllCustomer(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public Customer getCustomer(int id) {
        Optional<Customer> OptCustomer = customerRepository.findById(id);
        if(OptCustomer.isPresent()){
           Customer customer1= OptCustomer.get();
           return customer1;
        }else{
            return null;
        }
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
          Optional<Customer> existingCustomer = customerRepository.findById(id);
          if(existingCustomer !=null){
              Customer customer1=existingCustomer.get();
              customer1.setName(customer.getName());
              customer1.setAddress(customer.getAddress());

             log.info("Customer Updated Successfully");

             return customerRepository.save(customer1);

         }else{
             return null;
         }
    }

    @Override
    public List<Customer> getAllCutstomer() {
         return customerRepository.findAll();
    }
}
