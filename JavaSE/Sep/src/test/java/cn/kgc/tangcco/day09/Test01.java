package cn.kgc.tangcco.day09;

import org.junit.Test;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/9 10:46
 */
public class Test01 {
//    6. 使用File类下的常用方法获取某些文件的信息。
//            7. 操作D盘下的my.txt文件
//1)判断my.txt文件是否存在
//2)若存在则删除;若不存在则创建
   @Test
    public void test01(){
       File file = new File("D:\\my.txt");
       if (file.canExecute()){
           file.delete();
           System.out.println("删除");

       }else {
           System.out.println("不存在");
       }
    }


   // 6. 使用File类下的常用方法获取某些文件的信息。
    @Test
    public void test02(){
       File file = new File("D:\\");
       File[] file1=file.listFiles();
        for (File f: file1 ) {
            System.out.println(f.getName());
        }
   }
//    8. 使用File类删除某个文件夹（例如D盘下的temp文件夹）下的所有文件和文件夹:
//            1）判断temp文件夹下的文件类型，如果是文件则直接删除
//2）如果是文件夹则获取该文件夹下的子文件和文件夹
//3）使用递归的方式删除所有temp文件夹下的文件和文件夹
    @Test
    public  void test04(){
       test03(new File("D:\\CloudMusic"));

    }
    public void test03(File file){

        File[] files = file.listFiles();

        if (files != null) {
            for (File file2 : files) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                   test03(file2);
                    file2.delete();
                }
            }
        } else {
            file.delete();
        }
    }

//    利用IO操作文件
//1)利用代码在D盘下创建news文件夹。
//2)利用代码在news文件夹下创建2个.docx文件，2个.java文件，2个.txt的文件（在控制台打印news文件夹下的.java文件
    @Test
    public void test06(){
       File f= new File("D:\\news");
       f.mkdir();
        try {
            File.createTempFile("myDocx",".docx",f);
            File.createTempFile("myJava",".java",f);
            File.createTempFile("myTxt",".txt",f);
        } catch (IOException e) {
            e.printStackTrace();
        }
       File[]f2= f.listFiles();
        for (File file:
             f2) {
            System.out.println(file.getName());
        }
  }
//    10.列出D盘下的所有文件，子目录中的文件，子目录的子目录都要列出，依次类推，总之D盘下所有的文件都要输出（50分）
//      1)在列出的时候判断是否子文件夹（10分）
//       2)若不是子文件夹直接输出文件名（20分）
//      3)若是子文件夹使用递归的形式继续输出子目录中的文件（20分）
    public void test07(File file){
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        System.out.println("文件：" + file2.getAbsolutePath());
                    } else if (file2.isDirectory()) {
                        System.out.println("目录：" + file2.getAbsolutePath());
                        test07(file2);
                    }
                }
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void test08(){
        File file = new File("D:\\");
        test07(file);
    }

}
