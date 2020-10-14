package cn.kgc.tangcco.day11.tang.bean;

import cn.kgc.tangcco.day11.tang.Card;
import cn.kgc.tangcco.day11.tang.base.BaseBankCard;


/**
 * @author 李庆华
 * @Description 主卡
 * @date 2020/9/11 8:53
 */
public class MainCard extends BaseBankCard {

    public MainCard(String id, int pwd, String name, double balance) {
        super(id, pwd, name, balance);
    }

    /**
     *  取款方法
     * @param money 取款金额
     * @return 是否取款成功
     */
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
     * 转账
     * @param id 卡号
     * @param money 金额
     * @return 是否成功
     */
    public  boolean postMoney(String id, double money){
        BaseBankCard card = Card.getInstance().card(id);
        if ( card !=null&& money>0) {
            card.setBalance(card.getBalance()+money);
            this.setBalance(this.getBalance()-money);
            return true;
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
