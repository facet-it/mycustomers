
package be.facet.it.dojo.customershibernate.domain;

import java.util.Date;

/**
 *
 * Note: for these kind of persistence classes: would it be advisable to make them immutable? 
 * check here: http://vlkan.com/blog/post/2015/03/21/immutable-persistence/
 */
public class Purchase {
    private long id;
    private long product_id;
    private long customer_id;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
