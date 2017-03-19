/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facet.it.dojo.customershibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Beheerder
 */
public abstract class AbstractRepository {
    
    protected final SessionFactory sessionFactory = HibernateSession.FACTORY.factory();
    
    protected Session startTransaction() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }
    
    protected void stopTransaction(Session session) {
        session.getTransaction().commit();
        session.close();
    }
    
}
