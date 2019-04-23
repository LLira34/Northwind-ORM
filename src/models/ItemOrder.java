package models;

/**
 *
 * @author LLira
 */
public class ItemOrder {

    private Integer orderId;

    public ItemOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return this.getOrderId().toString();
    }

}//End class
