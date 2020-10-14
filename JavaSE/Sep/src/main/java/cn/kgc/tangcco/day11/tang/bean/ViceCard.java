package cn.kgc.tangcco.day11.tang.bean;

import cn.kgc.tangcco.day11.tang.base.BaseBankCard;

/**
 * @author 李庆华
 * @Description 副卡
 * @date 2020/9/11 8:54
 */
public class ViceCard extends BaseBankCard {
    public ViceCard(String id, int pwd, String name, double balance) {
        super(id, pwd, name, balance);
    }

    @Override
    public boolean getMoney(double money) {
        if (money<=getBalance()){
            setBalance(getBalance()-money);
            return true;
        }else {
            System.out.println("余额不足");
        }
        return false;
    }
    /**
     * 查询余额
     */
    @Override
    public void checkBalance() {
        System.out.println(this.getName()+"您好，您的账户余额为:"+this.getBalance()+"元");

    }
    /**
     * 存款
     * @param money 金额
     * @return 是否成功
     */
    @Override
    public boolean setMoney(double money) {
        if (money>0){
            setBalance(getBalance()+money);
            return true;
        }
        return false;
    }
}
