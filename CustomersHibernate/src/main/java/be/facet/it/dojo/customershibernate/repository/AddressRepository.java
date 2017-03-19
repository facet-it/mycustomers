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
public class AddressRepository extends AbstractRepository{
    
    public void save(Address address) {
        Session session = this.startTransaction();
        session.save(address);
        this.stopTransaction(session);
    }
    
}
