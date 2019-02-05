package com.onlineshop;
import java.util.*;

public class OrderDetails {
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
}
