package models;

/**
 *
 * @author LLira
 */
public class ItemCustomer {

    private Integer customerID;
    private String contactName;

    public ItemCustomer(Integer customerID, String contactName) {
        this.customerID = customerID;
        this.contactName = contactName;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return this.getContactName();
    }

}//End class
