package com.codeclan.example.coursebooking.Repositories.CustomerRepository;

import com.codeclan.example.coursebooking.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersForCourse(Long customerId) {
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.customer", "customerAlias");
            cr.add(Restrictions.eq("customerAlias.id", customerId));

            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return results;
    }
}
