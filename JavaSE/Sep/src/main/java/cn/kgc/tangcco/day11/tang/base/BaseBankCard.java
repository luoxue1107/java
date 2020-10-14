package cn.kgc.tangcco.day11.tang.base;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description 银行卡信息模板
 * @date 2020/9/11 8:38
 */
@Setter
@Getter
public abstract class BaseBankCard {
//    1、创建java项目，创建包及银行卡实体类，属性包括卡号、密码、用户名、余额。方法包括存款方法、返回卡信息方法(重写Object类的toString方法)、抽象的取款方法。
//    提示：取款方法原型：
//    public abstract boolean getMoney(double money);
    /**
     * 卡号
     */
    private  String id;
    /**
     * 密码
     */
    private  int pwd;
    /**
     * 用户名
     */
    private  String name;
    /**
     * 余额
     */
    private  double balance;

    /**
     *  取款方法
     * @param money 取款金额
     * @return 是否取款成功
     */
    public abstract boolean getMoney(double money);

    /**
     * 查询余额
     */
    public abstract  void checkBalance();

    /**
     * 存款
     * @param money 金额
     * @return 是否成功
     */
    public abstract  boolean setMoney(double money);

    public BaseBankCard(String id, int pwd, String name, double balance) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
