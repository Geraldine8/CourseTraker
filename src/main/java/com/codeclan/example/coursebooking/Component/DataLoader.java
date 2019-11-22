package com.codeclan.example.coursebooking.Component;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }


    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Anna", "Glasgow", 20);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Kisty", "Glasgow", 38);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Carlyn", "Paisley", 41);
        customerRepository.save(customer3);


        Course course1 = new Course("Learn French", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Learn French", "Paisley", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Learn German", "Ayr", 3);
        courseRepository.save(course3);



        Booking booking1 = new Booking("10-22-19", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("10-01-20", course1, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("10-02-20", course2, customer3);
        bookingRepository.save(booking3);


    }
}
