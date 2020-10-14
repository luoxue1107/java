package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description 银行 卡号信息
 * @date 2020/8/19 21:20
 */
public class Account {
    /**
     *卡号
     */
    private  String id="12345";
    /**
     * 余额
     */
   private double balance=0.0;
    /**
     * 所属用户
     */
    private String customer="工商银行";

    /**
     * 返回卡信息
     * @return
     */
    public String getInfo(){
        return "卡号:"+this.id+"\n余额:"+this.balance+"\n所属用户:"+this.customer+"\n"+Customer.getInfo();
    }

    /**
     * 查询余额
     * @return
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * 取钱方法
     * @param money
     * @return
     */
    public  double withdraw(double money){
        if (money<=this.balance){
            this.balance=this.balance-money;
            return this.balance;
        }else {
            return -1;
        }

    }

    /**
     * 存钱方法
     * @param money
     * @return
     */
    public double save(double money){
        if (money>0){
            this.balance=money+this.balance;
            return this.balance;
        }else {
            return -1;
        }
    }

}
