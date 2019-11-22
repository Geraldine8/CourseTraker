package com.codeclan.example.coursebooking.Controllers;


import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    //Get all customers for a given course

    @GetMapping(value="/courses/{customerId}")
    public List<Customer> getCustomerByCourseId(@PathVariable Long customer_id){
        return customerRepository.getCustomersForCourse(customer_id);
    }



}
