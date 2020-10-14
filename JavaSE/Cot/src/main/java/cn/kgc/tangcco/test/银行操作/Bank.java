/**
    银行类
 */
import java.util.*;
public class Bank {
    Scanner input = new Scanner(System.in);
    int B =5;
    User[] users = new User[B];

    //初始 （如果存在一些程序的初始必须执行的代码，则写到这个方法里）
    public Bank() {
        //方法一
        User user = new User();
        user.setUserName("张三");
        user.setCard("1234");
        user.setPassword("1234");
        user.setID("211200010101234");
        user.setPhone("15011111111");
        user.setBalance(5000.0);
        users[0] = user;
        //方法二
        users[1] = new User();
        users[1].setUserName("李四");
        users[1].setCard("6200820072002345");
        users[1].setPassword("2345");
        users[1].setID("211200010102345");
        users[1].setPhone("15022222222");
        users[1].setBalance(4000.0);
        //方法三
        users[3] = new User("王五", "6200720082003456",
                "3456", "211200010103456", "15033333333", 3000.0);
    }
    //初始登录
    public void in(){
        for (;;){
            System.out.println("=============");
        System.out.println("1.登录 2.注册");
            System.out.println("=============");
            System.out.println("输入编号：");
        int judge=input.nextInt();
        switch (judge){
            case 1:
                this.login();
                break;
            case 2:
                this.ceeate();
                break;
            default:
                System.out.println("输入有误");
            }
        }
    }
    //登录账户
    public void login() {
         for (int i=0;i<3;i++){
             System.out.println("==========");
            System.out.println("请输入卡号");
            String ka = input.next();
             System.out.println("==========");
            System.out.println("请输入密码");
            String mi = input.next();
            User U = verify(ka, mi);
            if (U != null) {
                this.ShowMenu(U);
            } else {
                System.out.println("卡号或密码不正确");
            }
         }
         System.out.println("错误三次");
         this.in();
    }

    //验证
    public User verify(String ka, String mi) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {//非空判断
                //卡号和密码
                if (ka.equals(users[i].getCard()) && mi.equals(users[i].getPassword())) {
                    //存在
                    return users[i];
                }
            }
        }
        //不存在
        return null;
    }

    //菜单
    public void ShowMenu(User U) {
        int choice;
        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("1.存款 2.转账 3.取款 4.查询余额 5.修改密码 " +
                    "6.修改手机号 7.注销账户 8.查看用户信息 0.退出");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("请输入执行编号：");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("存款");
                    this.deposit(U);
                    break;
                case 2:
                    System.out.println("转账");
                    this.transfer(U);
                    break;
                case 3:
                    System.out.println("取款");
                    this.withdrawal(U);
                    break;
                case 4:
                    System.out.println("查询余额");
                    this.balance(U);
                    break;
                case 5:
                    System.out.println("修改密码");
                    this.change(U);
                    break;
                case 6:
                    System.out.println("修改手机号");
                    this.phone(U);
                    break;
                case 7:
                    System.out.println("注销账户");
                    this.delete();
                    break;
                case 8:
                    System.out.println("个人信息");
                    this.details(U);
                    break;
                case 0:
                    System.out.println("退出");
                    this.in();
                default:
                    System.out.println("输入有误!请重新输入!");
            }
        } while (true);
    }

    //开户
    public void ceeate() {
        int count = 0;
        for (int i = 0; i < this.users.length; i++) {
            if (users[i] != null) {
                count++;
                if (count == this.users.length) {
                    this.users = Arrays.copyOf(this.users, this.users.length * 2);
                }
            } else if (users[i] == null) {
                String card="";
                for (int k=0;k<this.users.length;i++){
                    int c = (int) (Math.random() * 100000000);
                    String b = "62008200";
                    String card1=b+c;
                    boolean boo=this.verify3(card1);
                    if (boo){
                        card =card1;
                        break;
                    }else {
                        continue;
                    }
                }
                String name;
                String mi;
                String id;
                String phone;
                double balance;
                do {
                    System.out.println("==========");
                    System.out.println("用户名");
                    name = input.next();
                }while (name.length()>=4);
                do {
                    System.out.println("==========");
                    System.out.println("密码");
                     mi = input.next();
                }while (mi.length()<6||mi.length()>16);
                do {
                    System.out.println("==========");
                    System.out.println("身份证号");
                     id = input.next();
                }while (id.length()<18);
                do {
                    System.out.println("==========");
                    System.out.println("绑定手机号");
                     phone = input.next();
                }while (phone.length()>11);
               do {
                   System.out.println("==========");
                   System.out.println("需存钱");
                   balance = input.nextDouble();
               }while (balance<0);
                users[i] = new User(name, card, mi, id, phone, balance);
                System.out.println("-----------------------------------");
                System.out.println("卡号："+users[i].getCard());
                System.out.println("密码："+users[i].getPassword());
                System.out.println("账户名：："+users[i].getUserName());
                System.out.println("电话号："+users[i].getPhone());
                System.out.println("-----------------------------------");
                System.out.println("确定建立账户吗（y/n）");
                char judge = input.next().charAt(0);
                if (judge == 'y') {
                    return;
                } else if (judge == 'n') {
                    continue;
                }
            }
        }
    }

    //存款
    public void deposit(User U) {
        double b = U.getBalance();
        System.out.println("==========");
        System.out.print("请输入存款金额：");
        double deposit = input.nextDouble();
        if (deposit > 0) {
            double result = deposit + b;
            U.setBalance(result);
        } else {
            System.out.println("输入金额有误");
        }

    }

    //取款
    public void withdrawal(User U) {
        double b = U.getBalance();
        System.out.println("==========");
        System.out.print("请输入取款金额：");
        double fetch = input.nextDouble();
        if (fetch <= b) {
            double result = b - fetch;
            U.setBalance(result);
            System.out.println("取款完成");
        } else {
            System.out.println("余额不足");
        }
    }

    //转账
    public void transfer(User U) {
        double b = U.getBalance();
        char w;
        User H;
        for (; ; ) {
            System.out.println("==========");
            System.out.println("输入对方卡号：");
            String card = input.next();
            System.out.println("==========");
            System.out.println("输入对方用户名：");
            String id = input.next();
            H = verify2(card, id);
            if (H == null) {
                System.out.println("没有此用户或者卡号、用户名有误");
                return;
            }
            String N = H.getUserName();
            String C = H.getCard();
            System.out.println("确定给\t用户名：" + N + "\t卡号" + C + "（y/n）");
            w = input.next().charAt(0);
            if (w == 'y') {
                break;
            } else if (w == 'n') {
                continue;
            }
        }
        double b1 = H.getBalance();
        System.out.print("请输入转给对方的金额：");
        double fetch = input.nextDouble();
        if (fetch <= b) {
            double result = b - fetch;
            double result1 = b1 + fetch;
            U.setBalance(result);
            H.setBalance(result1);
            System.out.println("钱已转给对方");
        } else {
            System.out.println("余额不足！");
        }
    }

    //查询余额
    public void balance(User U) {
        double b = U.getBalance();
        System.out.println("余额为：" + b);
    }

    //修改密码
    public void change(User U) {
        String m1 = U.getPassword();
        System.out.println("==========");
        System.out.println("输入新密码：");
        String m = input.next();
        if (m.equals(m1)) {
            System.out.println("新密码跟原密码相同");
            return;
        } else {
            U.setPassword(m);
            System.out.println("密码修改成功！");
        }
    }

    //绑定手机号修改
    public void phone(User U) {
        String p = U.getPhone();
        System.out.println("==========");
        System.out.println("请输入新手机号码：");
        String p1 = input.next();
        if (p1.equals(p)) {
            System.out.println("新手机号跟原手机号一样");
        } else {
            U.setPhone(p1);
            System.out.println("新手机号修改成功");
        }
    }

    //注销账户
    public void delete() {
        System.out.println("==========");
        System.out.println("请输入注销的卡号");
        String joiner=input.next();
        System.out.println("==========");
        System.out.println("请输入密码");
        String joiner1=input.next();
       int v= this.verify4(joiner,joiner1);
       if (v>=0){
        System.out.println("确定要删除这个账户吗（y/n）");
        char judge=input.next().charAt(0);
        if (judge=='y') {
            users[v]=null;
            for (int i=v;i<this.users.length;i++){
                users[i]=users[i+1];
                this.in();
            }
        }
       } else {
           System.out.println("你输入的卡号或密码有误");
       }
    }

    //查看个人信息
    public void details(User U) {
        String N = U.getUserName();
        String C = U.getCard();
        String P = U.getPhone();
        String id = U.getID();
        System.out.println("--------------------------------------------------");
        System.out.println("用户名：" + N + "\n卡号：" + C + "\n绑定手机号：" + P + "\n身份证号：" + id);
        System.out.println("--------------------------------------------------");
    }

    //转账查询
    public User verify2(String card, String id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {//非空判断
                //卡号和用户名
                if (card.equals(users[i].getCard()) && id.equals(users[i].getUserName())) {
                    //存在
                    return users[i];
                }
            }
        }
        return null;
    }

    //卡号重复验证
    public boolean verify3(String c) {
        for (int i = 0; i < this.users.length; i++) {
            if (users[i] != null) {
                if (c.equals(users[i].getCard())) {
                    return false;
                }
            }
        }
        return true;
    }
    //注销账户验证
    public int verify4(String card, String mi) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {//非空判断
                //卡号和用户名
                if (card.equals(users[i].getCard()) && mi.equals(users[i].getPassword())) {
                    //存在
                    return i;
                }
            }
        }
    return -1;
}
}
}