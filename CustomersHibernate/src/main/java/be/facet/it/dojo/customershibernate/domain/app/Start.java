/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facet.it.dojo.customershibernate.domain.app;

import be.facet.it.dojo.customershibernate.domain.Customer;
import be.facet.it.dojo.customershibernate.domain.Product;
import be.facet.it.dojo.customershibernate.domain.Purchase;
import be.facet.it.dojo.customershibernate.repository.CustomerRepository;
import be.facet.it.dojo.customershibernate.repository.HibernateSession;
import be.facet.it.dojo.customershibernate.repository.ProductRepository;
import be.facet.it.dojo.customershibernate.repository.PurchaseRepository;
import java.util.Date;

/**
 *
 * @author Beheerder
 */
public class Start {
    
    public static void main(String[] args) {
        ProductRepository productRepo = new ProductRepository();
        Product product = productRepo.fetchById(1L);
        
        CustomerRepository customerRepo = new CustomerRepository();
        Customer customer = customerRepo.fetchById(6L);
        
        
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setProduct(product);
        purchase.setDate(new Date());
        
        PurchaseRepository repository = new PurchaseRepository();
        repository.save(purchase);
        
        HibernateSession.FACTORY.factory().close();
    }
    
}
