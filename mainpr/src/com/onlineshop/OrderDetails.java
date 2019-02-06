package com.onlineshop;
import java.util.*;

public class OrderDetails //implements iDisplay
{
    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subtotal;
    ArrayList<OrderDetails> arrOrddet=new ArrayList<OrderDetails>();

    public void calcPrice() {
        subtotal=unitCost*quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public ArrayList<OrderDetails> getArrOrddet() {
        return arrOrddet;
    }

    public void setArrOrddet(ArrayList<OrderDetails> arrOrddet) {
        this.arrOrddet = arrOrddet;
    }
}
