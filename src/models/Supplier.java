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
@Table(name = "Suppliers")
public class Supplier {

    @Id
    @GeneratedValue
    private int supplierID;

    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Column(name = "ContactName", nullable = true, length = 30)
    private String contactName;

    @Column(name = "ContactTitle", nullable = true, length = 30)
    private String contactTitle;

    @Column(name = "City", nullable = true, length = 15)
    private String city;

    @Column(name = "Country", nullable = true, length = 15)
    private String country;

    public Supplier() {
    }

    public Supplier(int supplierID, String companyName, String contactName, String contactTitle, String city, String country) {
        this.supplierID = supplierID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.city = city;
        this.country = country;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
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

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
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

    @Override
    public String toString() {
        return this.getCompanyName() + " " + this.getContactName();
    }

}//End class
