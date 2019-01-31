import java.util.Scanner;
public class Customer extends User{
    String customerName;
    String address;
    String email;
    String creditCardInfo;
    String shippingInfo;
    public void register(String cusName,String addr,String em,String cardInf,String usId,String pass)
    {
        this.customerName=cusName;
        this.address=addr;
        this.creditCardInfo=cardInf;
        if(usId.equals(getUserid()))
            System.out.println("Username already exists");
        else
        {
            //setUserid(usId);
            //setPassword(pass);
        }
    }
    public void login(String usId,String pass)
    {
        //
    }
}
