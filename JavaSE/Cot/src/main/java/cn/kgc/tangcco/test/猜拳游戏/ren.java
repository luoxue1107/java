package drill;

import java.util.Scanner;

public class ren {
    String ningzi;
    int fen;
    Scanner shuru = new Scanner(System.in);

    public void renming() {
        System.out.print("请输入你的姓名:");
        ningzi = shuru.next();
}

    public int rencaozuo(){
        System.out.print("请出拳\t1.剪刀\t2.石头\t3.布：");
        int renchuquan=shuru.nextInt();
        switch (renchuquan){
            case 1:
                System.out.println(ningzi+"出的：剪刀");
                break;
            case 2:
                System.out.println(ningzi+"出的：石头");
                break;
            case 3:
                System.out.println(ningzi+"出的：布");
                break;
            default:
        }
        return renchuquan;
    }
}
