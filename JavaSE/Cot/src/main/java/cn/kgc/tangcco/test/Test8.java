import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        String num;
        //字体加密工具
        Scanner input = new Scanner(System.in);
        ;
        System.out.println("输入你要加密的语句：");
        num = input.next();
        //储存字符的数组长度取决于 字符串的长度
        char[] arr = new char[num.length()];
        for (int i = 0; i < arr.length; i++) {
            //把低元素下标赋值给高元素下标
            arr[(arr.length - 1) - i] = num.charAt(i);
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
//  0 1 2 3 4 5 6 7 8 9
