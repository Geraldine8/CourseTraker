package com.codeclan.example.coursebooking.Repositories.CourseRepository;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{

    //Get all courses with a given rating

    List<Course> findByStarRating(int starRating);

    //Get all courses for a given customer:

    List<Customer> getAllCustomersForCourse(Long id);


}
