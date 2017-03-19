/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facet.it.dojo.customershibernate.domain.app;

import be.facet.it.dojo.customershibernate.domain.Address;
import be.facet.it.dojo.customershibernate.repository.AddressRepository;

/**
 *
 * @author Beheerder
 */
public class Start {
    
    public static void main(String[] args) {
        System.out.println("Starting app...");
        Address address = new Address();
        
        address.setStreet("Kerkstraat");
        address.setNumber(45);
        address.setCity("Bevergem");
        address.setCustomerId(0);
        
        AddressRepository repository = new AddressRepository();
        repository.save(address);
    }
    
}
