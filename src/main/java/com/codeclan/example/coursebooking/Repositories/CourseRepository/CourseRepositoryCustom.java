package com.codeclan.example.coursebooking.Repositories.CourseRepository;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {

    //Get all courses with a given rating

    List<Course> findByStarRating(int starRating);

    //Get all courses for a given customer:

    List<Customer> getAllCustomersForCourse(Long id);

}
