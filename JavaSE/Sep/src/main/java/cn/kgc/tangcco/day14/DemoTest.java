package cn.kgc.tangcco.day14;

import java.text.ParseException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 16:15
 */
public class DemoTest {

    public static void main(String[] args) {
        Demo demo = new Demo();
        String str="s.java";
        System.out.println(demo.endsWith(str));
        String str1="211332190710173114";
        String judge = demo.judge(str1);
        System.out.println(judge);
        String str2="15042451234";
        String s = demo.test11(str2);
        System.out.println(s);
        String str3="2020-9-14";
        try {
            String s1 = demo.test13(str3);
            System.out.println(s1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
