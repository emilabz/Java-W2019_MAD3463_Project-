package com.onlineshop;

import java.util.*;

public class ShippingInfo //implements iDisplay
{
    private int shippingId;
    private String shippingType;
    private int shippingCost;
    private int shippingRegionId;
    ArrayList<ShippingInfo> arrShinfo=new ArrayList<ShippingInfo>();

    public void updateShippinInfo(ShippingInfo shInfo)
    {
        for(int i=0;i<arrShinfo.size();i++){
            if(shInfo.getShippingId()==arrShinfo.get(i).getShippingId()){
                arrShinfo.get(i).setShippingType(shInfo.getShippingType());
                arrShinfo.get(i).setShippingCost(shInfo.getShippingCost());
                arrShinfo.get(i).setShippingRegionId(shInfo.getShippingRegionId());
            }
        }
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingRegionId() {
        return shippingRegionId;
    }

    public void setShippingRegionId(int shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }

    public ArrayList<ShippingInfo> getArrShinfo() {
        return arrShinfo;
    }

    public void setArrShinfo(ArrayList<ShippingInfo> arrShinfo) {
        this.arrShinfo = arrShinfo;
    }
}
