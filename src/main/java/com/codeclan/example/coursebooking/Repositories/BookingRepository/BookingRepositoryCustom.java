package com.codeclan.example.coursebooking.Repositories.BookingRepository;

import com.codeclan.example.coursebooking.Models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    //Get all bookings for a given date

    List<Booking> findBookingsByDate(String date);
}
