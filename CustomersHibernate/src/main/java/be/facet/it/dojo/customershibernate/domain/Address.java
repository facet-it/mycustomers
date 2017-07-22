package be.facet.it.dojo.customershibernate.domain;

/**
 *
 * Note: for these kind of persistence classes: would it be advisable to make them immutable? 
 * check here: http://vlkan.com/blog/post/2015/03/21/immutable-persistence/
 */
public class Address {
    private long id;
    private String street;
    private String city;
    private int number;
    private String extra;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
