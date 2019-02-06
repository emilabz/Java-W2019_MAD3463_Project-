package com.onlineshop;


public class Products {
    int productID;
    String productName;
    float productPrice;
    int quantity;
    public Products(int prId,String prName,float prPrice,int quan){
        this.productID=prId;
        this.productName=prName;
        this.productPrice=prPrice;
        this.quantity=quan;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
