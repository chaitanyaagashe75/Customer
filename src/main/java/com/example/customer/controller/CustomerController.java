package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/post")
    private Customer addCustomer(@RequestBody Customer customer){

        return customerService.addCustomer(customer);
    }

    @RequestMapping("/postAll")
    private List<Customer> addAllCustomer(@RequestBody List<Customer> customers){
        return customerService.addAllCustomer(customers);
    }
    @RequestMapping("/get")
    public Customer getCustomer(@RequestParam int id){
        return customerService.getCustomer(id);
    }

    @RequestMapping("/update/{id}")
    private Customer updateCustomer(@PathVariable int id,@RequestBody Customer customer){
        return customerService.updateCustomer(customer,id);
    }

    @GetMapping("/getAll")
    private List<Customer> getAllCustomer(){
        return customerService.getAllCutstomer();
    }
}
