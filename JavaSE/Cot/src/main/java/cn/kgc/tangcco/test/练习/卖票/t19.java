import java.util.Scanner;

public class t19 {
    String xingming;
    int nianling;
    public void maipiao(){
        Scanner shuru =new Scanner(System.in);
        for (;;){
        System.out.print("请输入姓名：");
        xingming=shuru.next();
        if (xingming.equals("m")){
            System.out.println("结束程序");
            break;
        }
        System.out.print("请输入年龄：");
        nianling=shuru.nextInt();
        if (nianling>=18){
            System.out.println("姓名："+xingming+"\t年龄："+nianling+"\t门票价格20元！");
        }else{
            System.out.println("姓名："+xingming+"\t年龄："+nianling+"\t门票免费！");
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
