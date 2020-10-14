import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
//        int a=0;
//        System.out.println("开始抽奖y/n");
//        Scanner input = new Scanner(System.in);
//        char num = 'y';
//        while (num == 'y') {
//            num = input.next().charAt(0);
//            if (num == 'n') {
//                System.out.println("本次您中奖次数："+a);
//                System.out.println("欢迎下次光临");
//                break;
//            } else if (num=='y'){
//                int num1 = (int) (Math.random() * 10);
//                if (num1 >= 8) {
//                    System.out.println("恭喜您中奖了！！！");
//                    a++;
//                } else {
//                    System.out.println("很遗憾您没有中奖！！");
//                }
//            }else {
//                System.out.println("输入有误！\n请按y或n");
//            }
//        }
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        int i = 0;
        while (i < arr.length) {
            System.out.println("输入第" + (i+1) + "次");
            String num = input.next();
            arr[i] = num;
            i++;
            if (i == arr.length || num.equals("查看")) {
                for (String s : arr) {
                    System.out.println("为：" + s);
                }
            }
        }
    }
}