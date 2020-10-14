package cn.kgc.tangcco.Test.Test;/**
 * @Description 银行个人信息
 * @author 李庆华
 * @date 2020/8/19 21:21
 */public class Customer {
     /**
      * 姓名
      */
     private static String name;

     /**
      * 身份证号
      */
     private static String ip;
     /**
      * 联系电话
      */
     private static String phone;
     /**
      * 家庭地址
      */
     private static String HA;

     public void setName(String name1) {
          name = name1;
     }

     public void setIp(String ip1) {
          ip = ip1;
     }

     public void setPhone(String phone1) {
          phone= phone1;
     }

     public void setHA(String HA1) {
          HA = HA1;
     }

     public  static String getInfo(){
         return "姓名："+name+"\n身份证号："+ip+"\n联系电话："+phone+"\n家庭地址："+HA;
     }
}
