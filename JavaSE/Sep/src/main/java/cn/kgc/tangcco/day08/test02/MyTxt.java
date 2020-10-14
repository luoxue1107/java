package cn.kgc.tangcco.day08.test02;

import cn.kgc.tangcco.day04.tang.File;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/8 9:04
 */
public class MyTxt {
    public MyTxt(){}
    public void myCreate(){
        try {
            FileWriter fileWriter = new FileWriter("D:\\myHello.txt");
            System.out.println("完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
