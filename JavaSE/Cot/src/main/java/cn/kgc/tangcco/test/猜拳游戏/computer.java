import java.util.Scanner;

public class computer {
    String name;
    Scanner input=new Scanner(System.in);
    public void diannaoming(){
        System.out.print("请输入对方的角色（1.刘备2.孙权3.曹操）：");
        switch (jiaoce){
            case 1:
                name="刘备";
                break;
            case 2:
                name="孙权";
                break;
            case 3:
                name="曹操";
                break;
            default:
                System.out.println("操作有误！！！请输入：1 2 3 ");
        }
    }
}

