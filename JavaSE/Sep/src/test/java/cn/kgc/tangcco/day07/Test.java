package cn.kgc.tangcco.day07;

import java.text.SimpleDateFormat;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/7 11:39
 */
public class Test {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   @org.junit.Test
    public void test01() throws IllegalAccessException {
//    Date date1  =new Date();
//        String str= "1988-12-12 9:13:30";
//        System.out.println(date1);
//       String date = simpleDateFormat.format(date1);
//        System.out.println(date);
//        try{
//            String date2= simpleDateFormat.format(date);
//            System.out.println(date2);
//
//        }catch (Exception e){
//
//        }
       System.out.println(ClassLoader.getSystemClassLoader().getName());
       System.out.println(ClassLoader.getSystemClassLoader().getParent().getName());



   }
}
