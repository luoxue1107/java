package cn.kgc.tangcco.day10;

import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.*;
import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/10 8:39
 */
public class Test {
    Scanner input = new Scanner(System.in);
    @org.junit.Test
    public void test01() {
        String str = "Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于 1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。\n" +
                "Java 技术具有 卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科 学超级计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。\n" +
                "在全球云计算和移动互 联网的产业环境下，Java更具备了显著优势和广阔前景。";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\test\\java\\cn\\kgc\\tangcco\\day10\\file\\test.txt"));
            bufferedWriter.write(str);
            System.out.println("成功");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void test02(){
        try {
           BufferedReader bufferedReader =new BufferedReader(new FileReader("src\\test\\java\\cn\\kgc\\tangcco\\day10\\file\\test.txt"));
           int count=-1;

           while ( (count=bufferedReader.read())!=-1){
               System.out.print((char) count);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void test03()  {
        try {
            BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("D:\\news\\猫咪头像.jpg"));
            BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(new FileOutputStream("C:\\news\\猫咪头像.jpg"));
            int count=-1;
            while ((count=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(count);
                bufferedOutputStream.flush();
            }

            System.out.println("成功");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void  test04(){
        File file = new File("D:\\a.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(new FileOutputStream("D:\\acopy.txt"));
                int count=-1;
                while ((count=bufferedInputStream.read())!=-1){
                    bufferedOutputStream.write(count);
                    bufferedOutputStream.flush();
            } }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @org.junit.Test
    public void test05(){

    }
}
