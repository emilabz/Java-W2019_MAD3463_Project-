package com.onlineshop;

public class OrderDetails {
    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subtotal;

    public void calcPrice()
    {
        subtotal=unitCost*quantity;
    }
}
