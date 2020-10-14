import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       for (int i=0;;i++){
           System.out.println("输入一个整数小时数：");
           int hour = input.nextInt();
           int day=hour/24;
           int hour2=hour%24;
           System.out.println(hour2);
           System.out.println(hour+"小时可以分为"+day+"天零"+hour2+"小时");

       }
    }
}
