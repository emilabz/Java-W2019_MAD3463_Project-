package com.onlineshop;
import java.util.*;
public class shopmain {
    public static void main(String[] args)
    {
        int i=0;
        int it,qu;
        char ch='n';
        Customer cust=new Customer();
        ShippingInfo shInfo=new ShippingInfo();
        //Products p=new Products("p001","iphone",22,50);
        Scanner sc=new Scanner(System.in);
        ArrayList<Customer> arrCust=new ArrayList<Customer>();
        ArrayList<Products> arrProd=new ArrayList<Products>();
        //Products p=new Products("p001","iphone",22,50);
        arrProd.add(new Products(1,"Iphone X 64GB Black",649.99f,50));
        arrProd.add(new Products(2,"Samsung S9 64GB Black",499.99f,20));
        arrProd.add(new Products(3,"Huawei Mate 20 Pro 128GB Saphire Blue",1299.99f,10));
        //System.out.println(arrProd.size()+" "+arrProd.get(2).getProductName());

        System.out.println("Welcome/nSelect option\n1. Sign Up\n2. Sign In");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1){
            arrCust.add(new Customer());
            arrCust.get(arrCust.size()-1).register(c);
        }
        else{
            cust.login();   //call customer login-->pass credentials
        }
        System.out.println("Welcome user\nSelect Choice\n1.New Order\n2.Placed Orders\n3.Your cart\n4.Update your profile");
        String cho=sc.nextLine();
        switch(cho){
            case 1:
                System.out.println("-----Products-----");
                System.out.println("Option\tName\tPrice");
                for(int j=0;j<arrProd.size();j++){
                    System.out.println((j+1)+"\t"+arrProd.get(j).getProductName()+"\t"+arrProd.get(j).getProductPrice());
                }
                while(ch=='n'){
                    it=sc.nextInt();
                    sc.nextLine();
                    System.out.println("You have chosen "+arrProd.get(it-1).getProductName()+". Enter the quantity required (available:"+arrProd.get(it-1).getQuantity()+")");
                    qu=sc.nextInt();
                    sc.nextLine();
                    if(qu<=prod.get(i-1).getQuantity()){
                        ShoppingCart sc=new ShoppingCart();
                        sc.addCarItem(arrProd.get(it-1).getProductID(),qu,cust);

                        //Orders o=new Orders();
                        //o.placeOrder();
                    }

                }
                break;

            case 2:
        }

        //choice1



        //choice 2


        //once login succeeds display the list of products and ask whether to place order or not
        //if yes call placeorder from orderitems--passing object of customer
        //in orderitems create as many items to be ordered under the same order
        //when order is placed ask for shipping details*/
    }
}
