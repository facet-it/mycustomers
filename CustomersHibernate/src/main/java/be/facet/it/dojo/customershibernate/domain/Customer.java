package be.facet.it.dojo.customershibernate.domain;

import java.util.Date;

/**
 *
 * Note: for these kind of persistence classes: would it be advisable to make them immutable? 
 * check here: http://vlkan.com/blog/post/2015/03/21/immutable-persistence/
 */
public class Customer {
    
    
    private long id;
    private String firstName;
    private String lastName;
    private Address address;
    private String phone;
    private String email;
    private Date joinDate;
}
