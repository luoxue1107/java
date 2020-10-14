package My;

import java.util.TreeSet;

public class TestTreeSet {
    //TreeSet 排序
    public static void main ( String[] args ) {
        TreeSet<T1 > treeSet=new TreeSet<> (  );
        treeSet.add ( new T1 ("tom",15,"男",5000.0) );
        treeSet.add ( new T1 ("jack",18,"女",4000.0) );
        treeSet.add ( new T1 ("YY",20,"男",10000.0) );
        treeSet.add ( new T1 ("MM",23,"女",3000.0) );
        treeSet.add ( new T1 ("M1",23,"女",3000.0) );
        treeSet.add ( new T1 ("M2",24,"女",3000.0) );

        for (T1 t:treeSet ){
            System.out.println (t);
        }
    }
}
class T1 implements Comparable<T1>{
    String name;
    int age;
    String sex;
    double salary;
    public T1(String name,int age,String sex,double salary){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.salary=salary;
    }

    @Override
    public String toString ( ) {
        return "T1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo ( T1 o ) {
        //工资
        if (this.salary<o.salary){
            return 1;
        }else if (this.salary>o.salary){
            return -1;
        }else {
            //年龄
            if (this.age<o.age){
                return 1;
            }else if (this.age>o.age){
                return -1;
            }else {
                //名字 哈希码
                if (this.name.hashCode ()<o.name.hashCode ()) {
                return 1;
                }else if (this.name.hashCode ()>o.name.hashCode ()){
                    return -1;
                }
                return 0;
            }
        }

    }
}
