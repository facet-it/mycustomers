
package be.facet.it.dojo.customershibernate.domain;

import java.util.Date;

/**
 *
 * Note: for these kind of persistence classes: would it be advisable to make them immutable? 
 * check here: http://vlkan.com/blog/post/2015/03/21/immutable-persistence/
 */
public class Purchase {
    private long id;
    private Product product;
    private Customer customer;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
