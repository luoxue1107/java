package My;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class TestEquals {
        public static void main(String[] args) {
                Object o=new S("tow",10,"男");
                Object o1=new S("tow",10,"男");
                System.out.println(o);
                System.out.println(o==o1);
                System.out.println(o.equals(o1));
                      
        }
}
class S{
        String name;
        int age;
        String sex;
        public S(String name,int age,String sex){
                 this.name=name;
                 this.sex=sex;
                 this.age=age;
    }
    //覆盖Object的方法
    public boolean equals(Object o){
            //判断地址是否一样 一样那么就是同一个对象
             if (this == o){
                return true;
             }
             //判断是不是空对象
             if (o ==null){
                return false;
             }
             //判断对象类型
             if (this.getClass()!=o.getClass()){
                 return false;
             }
             //强转为同类型
             S s=(S) o;
                         //属性对比
             if (this.name.equals(s.name)&&this.age==s.age && this.sex.equals(s.sex)){
                   return true;
             } else {
                 return false;
             }
    }
}