package com.example.EtstourHotelBooking.controller;


import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/all-customer")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @DeleteMapping("/customer/{id}")
    public Boolean deleteCustomer (@PathVariable int id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping ("/customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.findCustomerById(id);
    }
}
