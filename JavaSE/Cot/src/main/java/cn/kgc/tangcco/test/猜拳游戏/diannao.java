import java.util.Scanner;

public class diannao {
    String mingzi;
    int fen;
    Scanner shuru=new Scanner(System.in);
    public void diannaoming(){
        System.out.print("请输入对方的角色（1.刘备2.孙权3.曹操）：");
        int jiaoce=shuru.nextInt();
        switch (jiaoce){
            case 1:
               mingzi="刘备";
                break;
            case 2:
                mingzi="孙权";
                break;
            case 3:
                mingzi="曹操";
                break;
            default:
                System.out.println("操作有误！！！请输入：1 2 3 ");
        }
    }
    public int diancaozuo(){
        int dianchuquan=(int)(Math.random()*3);
        switch (dianchuquan){
            case 0:
                System.out.println(mingzi+"出的：剪刀");
                break;
            case 1:
                System.out.println(mingzi+"出的：石头");
                break;
            case 2:
                System.out.println(mingzi+"出的：布");
                break;
            default:
        }
        return dianchuquan+1;
    }
}

