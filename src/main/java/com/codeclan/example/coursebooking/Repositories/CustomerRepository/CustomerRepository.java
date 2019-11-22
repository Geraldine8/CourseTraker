package com.codeclan.example.coursebooking.Repositories.CustomerRepository;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    //Get all customers for a given course

//    List<Customer> getCustomerByCourse(Long id);
}
