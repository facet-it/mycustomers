/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facet.it.dojo.customershibernate.repository;

import be.facet.it.dojo.customershibernate.domain.Customer;
import org.hibernate.Session;

/**
 *
 * @author Beheerder
 */
public class CustomerRepository extends AbstractRepository<Customer>{

    @Override
    public void save(Customer entity) {
        Session session = this.startTransaction();
        session.save(entity);
        this.stopTransaction(session);
    }

    @Override
    public Customer fetchById(long id) {
        Session session = this.sessionFactory.openSession();
        return session.get(Customer.class, id);
    }
    
}
