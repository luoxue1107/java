package Jan16;

import java.awt.datatransfer.StringSelection;
import java.io.*;

public class TestObjectOutputStream {
    public static void main ( String[] args ) throws Exception {
        FileOutputStream ou = new FileOutputStream ( "IO\\Object.txt" );
        //对象输出流
        ObjectOutputStream Ob = new ObjectOutputStream ( ou );
        Ob.writeObject ( new m1 ( 21, "tow", "nan" ) );
        Ob.writeObject ( new m1 ( 21, "tow2", "nan" ) );
        Ob.writeObject ( new m1 ( 21, "tow3", "nan" ) );
        Ob.writeObject ( new m1 ( 21, "tow4", "nan" ) );
        Ob.close ();

        //对象输入流
        FileInputStream fi = new FileInputStream ( "IO\\Object.txt" );
        ObjectInputStream oi = new ObjectInputStream ( fi );
        Object m1;
        //循环输入流中的对象文件
        while (true) {
            try {
                m1=oi.readObject ();
                System.out.println (m1.toString ());
                //读取到文件尾部标志异常 抛出异常并退出循环
            }catch (EOFException e){
                break;
            }

        }
    }
}

class m1 implements Serializable {
    String name;
    //瞬时的 不会被序列化
    transient int age;
    String sex;

    @Override
    public String toString ( ) {
        return "m1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public m1 ( int age, String name, String sex ) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}