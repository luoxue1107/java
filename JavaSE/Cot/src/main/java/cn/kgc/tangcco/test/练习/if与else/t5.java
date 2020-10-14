import java.util.Scanner;

public class t5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("你考了多少分？");
        int fengshu = input.nextInt();
        if (fengshu<90){
            System.out.println("就会得到我的一个大嘴巴子！！！！");
        } else {
            System.out.println("就得到我的礼品！！！！");
        }
    }
}
