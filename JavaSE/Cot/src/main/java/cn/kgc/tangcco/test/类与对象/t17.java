import java.util.Scanner;

/**
 * 学生类功能特别强大
 * @author 李庆华
 * @version 1.1
 */
public class t17 {
    public static void main(String[] args) {
        Scanner shuRu=new Scanner(System.in);
        calc i=new calc();
        System.out.println("请输入java成绩：");
        i.java =shuRu.nextInt();
        System.out.println("请输入C成绩：");
        i.C =shuRu.nextInt();
        System.out.println("请输入DB成绩：");
        i.DB =shuRu.nextInt();

        System.out.println("总成绩"+i.zong());
        System.out.println("平均成绩"+i.pingjun());
    }
}


