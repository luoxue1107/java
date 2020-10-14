import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入：");
        int G = input.nextInt();
        //等腰三角形
        for (int i = 1; i <= G; i++) {
            //第一行
            if (i == 1) {
                for (int j = 0; j < (G-1); j++) {
                    System.out.print(" ");
                }
                System.out.print("O");
                //最后一行
            } else if (i == G) {
                for (int j = 0; j < (G * 2)-1; j++) {
                    System.out.print("O");

                }
                //中间
            } else {
                //空格
                for (int j = G; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print("O");
                //三角中间空间
                for (int j = 0; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("O");
            }
            //换行
            System.out.println("");
        }
    }
}
