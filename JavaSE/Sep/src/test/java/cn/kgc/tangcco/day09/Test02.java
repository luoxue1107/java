package cn.kgc.tangcco.day09;

import org.junit.Test;

import java.io.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/9 14:32
 */
public class Test02 {
    @Test
    public void test() {
        File file = new File("D:\\news\\my.txt");
        try {
            if (file.exists()) {

            } else {
                System.out.println(file.createNewFile());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
     public void test01(){
        File file = new File("D:\\news\\my.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String string="li";
            fileOutputStream.write(string.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
