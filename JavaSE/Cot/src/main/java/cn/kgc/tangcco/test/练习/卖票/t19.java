import java.util.Scanner;

public class t19 {
    String xingming;
    int nianling;
    public void maipiao(){
        Scanner shuru =new Scanner(System.in);
        for (;;){
        System.out.print("������������");
        xingming=shuru.next();
        if (xingming.equals("m")){
            System.out.println("��������");
            break;
        }
        System.out.print("���������䣺");
        nianling=shuru.nextInt();
        if (nianling>=18){
            System.out.println("������"+xingming+"\t���䣺"+nianling+"\t��Ʊ�۸�20Ԫ��");
        }else{
            System.out.println("������"+xingming+"\t���䣺"+nianling+"\t��Ʊ��ѣ�");
        }
        }
    }

}
class youkeceshi{
    public static void main(String[] args) {
       t19 i =new t19();
        i.maipiao();
    }
}
