package com.onlineshop;
import java.util.*;
public class Customer extends User {
    String customerName;
    String address;
    String email;
    String creditCardInfo;
    String shippingInfo;
    int flag = 1;
    Scanner sc = new Scanner(System.in);
    ArrayList<Customer> arrCust=new ArrayList<Customer>();

    public void register(Customer c) {
        //,String addr,String em,String cardInf,String usId,String pass;
        String uid=null;
        String pass;
        do {
            flag = 0;
            System.out.println("Enter new userid:\n");
            uid = sc.nextLine();
            for (int i = 0; i < arrCust.size(); i++) {
                if (arrCust.get(i).getUserid().contains(c.getUserid())) {
                    System.out.println("Username already used..renter\n");
                    flag = 1;
                }
            }
        } while (flag == 1);
        System.out.println("Enter password");
        pass=sc.nextLine();
        c.setUserid(uid);
        c.setPassword(pass);
        c.setLoginStatus("C");
        System.out.println("Enter your Name:\n");
        c.customerName = sc.nextLine();
        System.out.println("Enter your email-id:\n");
        c.email = sc.nextLine();
        System.out.println("Enter Address:\n");
        c.address = sc.nextLine();
        System.out.println("Enter credit card info:\n");
        c.creditCardInfo = sc.nextLine();
        System.out.println("Enter shipping info:\n");
        c.shippingInfo = sc.nextLine();
    }

    public void login() {
        System.out.println("Enter Username:");
        String uid = sc.nextLine();
        System.out.println("Enter Password:");
        String passw = sc.nextLine();
        if(verifyLogin(uid,passw))
            System.out.println("User logged in successsfully");
        else
            System.out.println("User couldn't login");
    }

    public boolean verifyLogin(String uid, String pass)
    {
        if(arrCust.isEmpty()){
            return false;
        }
        else{
            for(Customer cu:arrCust){
                if((cu.getUserid().contains(uid))&&(cu.getPassword().contains(pass))){
                    return true
                }
                else{
                    return false;
                }
            }
        }
    }
}
