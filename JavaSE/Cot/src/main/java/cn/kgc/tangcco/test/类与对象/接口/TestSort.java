package Test;

public class TestSort {
    public static void main(String[] args) {
        Student3[] S=new Student3[]{new Student3("张三",99.0),
                new Student3("李四",78.0),new Student3("王五",88.0)};
        sort(S);
        for (int i=0;i<S.length;i++){
            System.out.println(S[i].name+"\t"+S[i].score);
        }
    }
    public static void sort(Student3[] students){
        for (int i=0;i<students.length-1;i++){
            Comparable c =(Comparable)students[i];//把Student3类型的数组强转为接口类型的
            int n=c.compareTo(students[i+1]); //然后用接口类型的对象 应用对象中的compareTo有参方法
            //返回值判断
            if (n>0){
                Student3 S=students[i];
                students[i]=students[i+1];
                students[i+1]=S;
            }
        }
    }
}

//实现类
class Student3 implements Comparable<Student3>{
    String name;
    int age;
    String sex;
    double score;
    public Student3(){}
    public Student3(String name,double score){
        this.score=score;
        this.name=name;
    }

    public Student3(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public Student3(String name,int age,String sex,double score){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.score=score;
    }
    //接口 行为
    public int compareTo(Student3 s){
       if (this.score>s.score){
           return  1;
       }else if (this.score<s.score){
           return -1;
       }else {
           return 0;
       }
    }
}
