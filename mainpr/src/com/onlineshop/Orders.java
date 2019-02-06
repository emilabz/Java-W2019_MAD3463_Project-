package com.onlineshop;

import java.util.ArrayList;

public class Orders {
    private int orderid;
    private String dateCreated;
    private String dateShipped;
    private String customerName;
    private String customerId;
    private String status;
    private String shippingId;
    ArrayList<ShippingInfo> arrInfo=new ArrayList<ShippingInfo>();
    ArrayList<OrderDetails> arrOrddet=new ArrayList<OrderDetails>();
    public boolean placeOrder(Orders ord){
        if(arrOrd.isEmpty()){
            arrOrd.add(ord);
            return true;
        }
        else{
            for(int i=0;i<arrOrd.size();i++){
                if(arrOrd.get(i).getOrderid()!=ord.getOrderid()){
                    arrOrd.add(ord);
                    return true;
                }
            }
        }
        return false;
    }



    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustoemId() {
        return customerId;
    }

    public void setCustoemId(String custoemId) {
        this.customerId = custoemId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }
}
