public class TestObject {
    public static void main(String[] args) {
        Aen o=new t();
        Object o1=new t1();
       if (o.getClass()== o1.getClass()){
           System.out.printf("һ��");
        }else{
           System.out.printf("��һ��");
       }
       o.hashCode();
       o1.toString();
}
}
class Aen{ }
class t extends Aen {}
class t1 extends Aen{}
