import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        int g=0;
        Scanner input = new Scanner(System.in);
        tool(16);
        System.out.print("欢迎使用ATM自动银行服务");
        tool(16);
        System.out.println();
        System.out.println("1.开户 2.存款 3.取款 4.转账 5.查询余额 6.修改密码 0.退出");
        tool(54);
        System.out.println();
        System.out.println("请按上述提示输入编号：");
        int value=input.nextInt();
        while (value>6||value<0){
            System.out.print("输入有误!\n请重新输入：");
            value=input.nextInt();
            g++;
            if (g>=2){
                System.out.println("输入错误到达三次进行终止");
                break;
            }
        }
        switch (value) {
            case 1:
                System.out.println("--执行开户功能--");
                break;
            case 2:
                System.out.println("--执行存款功能--");
                break;
            case 3:
                System.out.println("--执行取款功能--");
                break;
            case 4:
                System.out.println("--执行转账功能--");
                break;
            case 5:
                System.out.println("--执行查询余额--");
                break;
            case 6:
                System.out.println("--执行修改密码--");
                break;
            case 0:
                System.out.println("--执行退出功能--");
                break;

        }
    }
    public static void tool(int count){
        for (int i = 1;i <= count; i++){
            System.out.print("=");
            }
        }
    }
