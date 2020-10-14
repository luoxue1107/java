package cn.kgc.tangcco.day16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/16 10:32
 */
public class Demo01 {
    public static void main(String[] age) throws IOException {
        BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
//    控制台录入字符
//        int read = stringBuffer.read();
//        System.out.println(read);
      //控制台录入字符串
        String s = stringBuffer.readLine();
        System.out.println(s);
        System.out.write(s.getBytes());
    }
}
