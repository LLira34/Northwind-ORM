package models;

/**
 *
 * @author LLira
 */
public class ItemProduct {

    private Integer productID;
    private String productName;

    public ItemProduct(Integer productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.getProductName();
    }

}//End class
