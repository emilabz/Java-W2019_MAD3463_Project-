package com.onlineshop;
import java.util.*;

public class ShoppingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private int dateAdded;
    ArrayList<ShoppingCart> arrCart= new ArrayList<ShoppingCart>();
    Products pro=new Products();
    public ShoppingCart(int cartId,int productId,int quantity,int dateAdded){
        this.cartId=cartId;
        this.productId=productId;
        this.quantity=quantity;
        this.dateAdded=dateAdded;
    }

    public boolean addCarItem(ShoppingCart sc)
    {
        if(arrCart.isEmpty()){
            arrCart.add(sc);
        }
        else{
            for(ShoppingCart s:arrCart){
                if(s.getCartId()!=sc.getCartId()) {
                    arrCart.add(sc);
                    return true;
                }
            }
            return false;
        }
    }
    public boolean updateQuantity(ShoppingCart sc)
    {
        for(ShoppingCart s:arrCart){
            if(sc.getCartId()==s.getCartId()){
                s.setProductId(sc.getProductId());
                s.setDateAdded(sc.getDateAdded());
                s.setQuantity(sc.getQuantity());
                return true;
            }
        }
        return false;

    }
    public void viewCartDetails(ShoppingCart sc)
    {
        for(Products p:pro.getArrProd()){
            if(sc.getProductId()==p.getProductID())
                System.out.println(sc.getCartId()+" "+sc.getProductId()+"   "+p.getProductName()+"  "+p.getProductPrice()+" "sc.getQuantity());
        }

    }
    public void checkOut()
    {

    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }
}
