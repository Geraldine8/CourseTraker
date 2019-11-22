package com.codeclan.example.coursebooking.Controllers;


import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


    @GetMapping(value="starRating/{starRating}")
    public List<Course> findCourseByRating(@PathVariable int starRating){
        return courseRepository.findByStarRating(starRating);
    }

    @GetMapping(value = "/{id}/customers")
    public List<Customer> customersForCourse(@PathVariable Long id){
        return courseRepository.getAllCustomersForCourse(id);
    }



}
