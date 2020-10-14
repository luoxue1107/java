import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入您的性别：");
        Scanner input = new Scanner(System.in);
        String name= input.next();
      if (name.equals("男")) {
          System.out.println("先生您好!!");
      }else if(name.equals("女")){
          System.out.println("女生你好!!");
      }else {
          System.out.println("错误");
      }
    }
}
