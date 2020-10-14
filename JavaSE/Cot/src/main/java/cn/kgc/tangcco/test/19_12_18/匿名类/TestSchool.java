package My;

public class TestSchool {
    public static void main(String[] args) {
        School s = new School();
        for (int i=1;i<T.v;i++){
            T t =s.m1(i);
            t.teach();
        }
    }
}
interface T{
    int v=10;
void teach();
}
class School{
    T t=null;//创建一个T 类型的返回值
    /*
     class T1 implements T{
       public void teach(){
       System.out.println("老师T1");
       }
     }
     class T2 implements T{
       public void teach(){
     System.out.println("老师T2");
       }
     }
    */
    public T m1(int v){
        if (v %2 != 0){
            //匿名内部类  这个就把创建类的步骤省去了 直接new对象
            t = new T(){
                @Override
                public void teach(){
                    System.out.println("老师T1上课>>>");
                }
            };
        }else{
            t = new T() {
                @Override
                public void teach() {
                   System.out.println("老师T2上课>>>");
                }
            };
        }
        return t;
    }
}