/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facet.it.dojo.customershibernate.repository;

import be.facet.it.dojo.customershibernate.domain.Address;
import org.hibernate.Session;

/**
 *
 * @author Beheerder
 */
public class AddressRepository extends AbstractRepository<Address>{

    @Override
    public void save(Address entity) {
        Session session = this.startTransaction();
        session.save(entity);
        this.stopTransaction(session);
    }

    @Override
    public Address fetchById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
