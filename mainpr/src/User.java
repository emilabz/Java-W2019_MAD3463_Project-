import java.util.ArrayList;
//import java.util.Arrays;

public class User {
    ArrayList<String> userid=new ArrayList<String>();

    public ArrayList<String> getUserid() {
        return userid;
    }

    public void setUserid(ArrayList<String> userid) {
        this.userid = userid;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

    ArrayList<String> password=new ArrayList<String>();
    String loginStatus;
    //String userid;
    //String password;
    public boolean verifyLogin(String uid, String pass)
    {
        if(userid.contains(uid) && password.contains(pass))
            return true;
        else
            return false;
    }
}
