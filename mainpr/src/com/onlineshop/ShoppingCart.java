package com.onlineshop;
import java.util.*;

public class ShoppingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private int dateAdded;
    private String cusID;
    Scanner sc=new Scanner(System.in);
    //Customer c=new Customer();
    //Products pro=new Products();
    /*public ShoppingCart(int cartId,int productId,int quantity,int dateAdded){
        this.cartId=cartId;
        this.productId=productId;
        this.quantity=quantity;
        this.dateAdded=dateAdded;
    }*/

    int ci=c.getArrCart().get(c.getArrCart().size()-1).getCartId();

    public boolean addCarItem(int prID,int q,Customer c)
    {
        if(c.getArrCart().isEmpty()){
            this.cartId=1;
        }
        else{
            this.cartId=c.getArrCart().get(c.getArrCart().size()-1).getCartId()+1;
           /* for(ShoppingCart s:arrCart){
                if(s.getCartId()!=sc.getCartId()) {
                    arrCart.add(sc);
                    return true;
                }
            }
            return false;*/
        }
        this.productId=prID;
        this.quantity=q;
        System.out.println("Enter date to be added\n");
        this.dateAdded=sc.nextInt();
        sc.nextLine();
    }
    public boolean updateQuantity(int quantity)
    {
        this.quantity=new quantity;
        /*for(ShoppingCart s:arrCart){
            if(sc.getCartId()==s.getCartId()){
                s.setProductId(sc.getProductId());
                s.setDateAdded(sc.getDateAdded());
                s.setQuantity(sc.getQuantity());
                return true;
            }
        }
        return false;*/

    }
    public void viewCartDetails(Customer c)
    {
        for(int i=0;i<c.getArrCart().size();i++){

        }
        for(Products p:pro.getArrProd()) {
            if (c.getArrCart().get(i).getProductId() == p.getProductID()) {
                System.out.println(c.getArrCart().get(i).getCartId() + "   " + c.getArrCart().get(i).getProductId() + "   " + p.getProductName() + "  " + p.getProductPrice() + " "+c.getArrCart().get(i).getQuantity());
            }
        }
    }
    public void checkOut(Customer c)
    {
        c.arr
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
*/
}
