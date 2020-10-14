package cn.kgc.tangcco.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/10 10:25
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count1 =0;
        int count2 =0;
        char[] chars = new char[]{'A','B','C','D'};
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("src\\test\\java\\cn\\kgc\\tangcco\\day10\\file\\test.txt"));
            int count= -1;
            while ((count=bufferedReader.read())!=-1){
                System.out.print((char) count);
                if (count=='*') {
                    System.out.print("输入选择的答案（A、B、C、D):");
                    char cha = input.next().charAt(0);
                    if (chars[count2++] == cha) {
                        count1++;
                    }
                }
            }
            System.out.println("分数："+count1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
