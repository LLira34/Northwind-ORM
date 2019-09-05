package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LLira
 */
@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue
    private int customerID;

    @Column(name = "CompanyName", nullable = false, length = 80)
    private String companyName;

    @Column(name = "ContactName", nullable = true, length = 60)
    private String contactName;

    @Column(name = "Address", nullable = true, length = 120)
    private String address;

    @Column(name = "City", nullable = true, length = 30)
    private String city;

    @Column(name = "Country", nullable = true, length = 30)
    private String country;

    @Column(name = "Phone", nullable = true, length = 48)
    private String phone;

    public Customer() {
    }

    public Customer(int customerID, String companyName, String contactName,
            String address, String city, String country, String phone) {
        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.country = country;
        this.phone = phone;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.getCompanyName() + " " + this.getContactName();
    }

}//End class
