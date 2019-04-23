package models;

/**
 *
 * @author LLira
 */
public class ItemSupplier {

    private Integer supplierID;
    private String contactName;

    public ItemSupplier(Integer supplierID, String contactName) {
        this.supplierID = supplierID;
        this.contactName = contactName;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
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
