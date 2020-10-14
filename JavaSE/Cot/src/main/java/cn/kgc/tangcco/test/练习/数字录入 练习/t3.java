 import java.util.Scanner;

public class t3 {
public static void main (String []args) {
    //录入数字的准备
    Scanner input= new Scanner (System.in);
    System.out.println("输入4位会员卡号");
    //正式录入
    int Vip = input.nextInt();
    //输入数字=Vip 输入数字的个位的数
    int ge = Vip%10;
    //取输入数值的十位数
    int shi = Vip/10%10;
    int bai = Vip/100%10;
    int qian = Vip/1000;
    int he = ge+shi+bai+qian;

    System.out.println("四位之和:"+he);
    String shifou = he>20?"是":"不是";
    System.out.println("是不是幸运的用户："+shifou);

	}
}

