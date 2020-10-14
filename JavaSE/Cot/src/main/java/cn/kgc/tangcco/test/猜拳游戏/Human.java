import java.util.Scanner;

public class Human {
    String name;
    Scanner input = new Scanner(System.in);

    public void renming() {
        System.out.print("请输入你的姓名:");
        name = input.next();
    }
}
