package com.codeclan.example.coursebooking;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.Repositories.CustomerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoursebookingApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void findCoursesByStarRating(){
		List<Course> foundCourses = courseRepository.findByStarRating(5);
		assertEquals(2, foundCourses.size());
	}

	@Test
	public void canGetCustomerByCourse(){
		List<Customer> foundCustomer = customerRepository.getCustomersForCourse(1l);
		assertEquals(1, foundCustomer.size());
	}


	@Test
	public void findAllCoursesForCustomer_LearnFrench() {
		List<Customer> found = courseRepository.getAllCustomersForCourse(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void findBookingsByDate(){
		List<Booking> foundDate = bookingRepository.findBookingsByDate("10-22-19");
		assertEquals(1, foundDate.size());
	}

//	@Test
//	public void getAllCustomerByTownByCourse(){
//		List<Customer> found = courseRepository.getCustomersForCourse()
//	}

}
