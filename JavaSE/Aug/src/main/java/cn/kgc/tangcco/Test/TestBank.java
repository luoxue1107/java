package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description 银行
 * @date 2020/8/19 21:51
 */
public class TestBank {
    public static void main(String[] args) {
        Account account=new Account();
        Customer customer=new Customer();

        customer.setHA("中国");
        customer.setIp("21130311111111234");
        customer.setName("Tom");
        customer.setPhone("15012345678");
        //查看卡信息
        System.out.println(account.getInfo());
        //查看个人信息
        System.out.println(Customer.getInfo());
        System.out.println(account.getBalance());
        System.out.println(account.save(10000));
        System.out.println(account.withdraw(7000));
        System.out.println(account.getBalance());


    }
}
