package com.codeclan.example.coursebooking.Repositories.BookingRepository;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> findBookingsByDate(String date){
        List<Booking> results = null;
        Session session = entityManager.unwrap(Session.class); //
        try{
            Criteria cr = session.createCriteria(Booking.class);//select from booking table
            cr.add(Restrictions.eq("date", date));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }

        return results;

    }

}
