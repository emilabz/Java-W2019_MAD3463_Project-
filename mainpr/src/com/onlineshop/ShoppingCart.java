package com.onlineshop;
import java.util.*;

public class ShoppingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private int dateAdded;
    ArrayList<ShoppingCart> arrCart= new ArrayList<ShoppingCart>();
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
    public void updateQuantity(ShoppingCart sc)
    {
        for(ShoppingCart s:arrCart){
            if(sc.getCartId()==s.getCartId()){

            }
        }

    }
    public void viewCartDetails()
    {

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
