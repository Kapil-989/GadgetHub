/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

/**
 *
 * @author LAPTOP
 */
public class OrderPojo {

    public OrderPojo(String orderId, String prodId, int quantity, double amount, int shipped) {
        this.orderId = orderId;
        this.prodId = prodId;
        this.quantity = quantity;
        this.amount = amount;
        this.shipped = shipped;
    }

    public OrderPojo() {
    }

    public int getShipped() {
        return shipped;
    }

    public void setShipped(int shipped) {
        this.shipped = shipped;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    
    private String orderId;
    private String prodId;
    private int quantity;
    private double amount;
    private int shipped;
}
