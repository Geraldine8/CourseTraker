package com.codeclan.example.coursebooking.Repositories.CustomerRepository;

import com.codeclan.example.coursebooking.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersForCourse(Long courseId);

    //Get all customers in a given town for a given course

//    List<Customer> getAllCustomerByTownByCourse();
}
