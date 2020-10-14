public class User {
    //卡号
    private String card;
    //密码
    private String password;
   //身份证号
    private String ID;
   //用户名
    private String userName;
    //手机号
    private String phone;
    //余额
    private double balance;
    public User(){}
    public User(String userName,String card,String password,String id,String phone,double balance){
        this.userName=userName;
        this.card=card;
        this.password=password;
        this.ID=id;
        this.phone=phone;
        this.balance=balance;
    }
    public void setCard(String card){
        this.card=card;
    }
    public String getCard(){
        return this.card;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setID(String id){
        this.ID=id;
    }
    public String getID(){
        return this.ID;
    }
    public void setPhone(String  phone){
        this. phone= phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
}
