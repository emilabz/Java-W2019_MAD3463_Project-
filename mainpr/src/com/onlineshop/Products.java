package com.onlineshop;

import java.util.ArrayList;

public class Products {
    String productID;
    String productName;
    float productPrice;
    int quantity;
    ArrayList<Products> arrProd=new ArrayList<Products>();

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public ArrayList<Products> getArrProd() {
        return arrProd;
    }

    public void setArrProd(ArrayList<Products> arrProd) {
        this.arrProd = arrProd;
    }
}
