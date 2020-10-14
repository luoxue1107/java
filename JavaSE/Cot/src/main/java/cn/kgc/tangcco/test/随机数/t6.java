import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员号");
        int Vip = input.nextInt();
        int Y = Vip/100%10;
        //"Math.random();" 的值在0~1之间 随机小数，后面乘10 可以让得到的小数向前进一位
         double D = Math.random();
        //括号里的int是让其 强制转换为整数，java里是没有四舍五入的 小数点后位全部清掉
        System.out.println('Y'+Y);
        System.out.println('D'+(int)D);
        if (Y == D){
            System.out.println("中奖了");
        }else {
            System.out.println("谢谢惠顾");
        }

    }
}