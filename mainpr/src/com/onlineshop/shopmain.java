package com.onlineshop;
import java.util.*;
public class shopmain {
    public static void main(String[] args)
    {
        int i=0;
        int it,qu;
        char ch='n';
        Customer cust=new Customer();
        Scanner sc=new Scanner(System.in);
        //ArrayList<User> arrlUser=new ArrayList<User>();
        //ArrayList<Products> prod=new ArrayList<Products>();
        System.out.println("Welcome/nSelect option\n1. Sign Up\n2. Sign In");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1){
            Customer c=new Customer();
            cust.register(c);
        }
        else{
            cust.login();   //call customer login-->pass credentials
        }
        System.out.println("Welcome user\nSelect Choice\n1.New Order\n2.Placed Orders\n3.Your cart");
        String cho=sc.nextLine();
        //switch(cho){};

        //choice1

        System.out.println("-----Products-----");
        System.out.println("Option\tName\tPrice");
        for(int j=0;j<prod.size();j++){
            System.out.println(i+"\t"+prod.get(i).getProductName()+"\t"+prod.get(i).getProductPrice());
        }
        while(ch=='n'){
            it=sc.nextInt();
            System.out.println("You have chosen "+prod.get(it-1).getProductName()+". Enter the quantity required (available:"+prod.get(it-1).getQuantity()+")");
            qu=sc.nextInt();
            if(qu<=prod.get(i-1).getQuantity()){
                Orders o=new Orders();
                o.placeOrder();
            }

        }

        //choice 2


        //once login succeeds display the list of products and ask whether to place order or not
        //if yes call placeorder from orderitems--passing object of customer
        //in orderitems create as many items to be ordered under the same order
        //when order is placed ask for shipping details
    }
}
