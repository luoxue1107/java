package drill;

import java.util.Scanner;

public class ren {
    String ningzi;
    int fen;
    Scanner shuru = new Scanner(System.in);

    public void renming() {
        System.out.print("�������������:");
        ningzi = shuru.next();
}

    public int rencaozuo(){
        System.out.print("���ȭ\t1.����\t2.ʯͷ\t3.����");
        int renchuquan=shuru.nextInt();
        switch (renchuquan){
            case 1:
                System.out.println(ningzi+"���ģ�����");
                break;
            case 2:
                System.out.println(ningzi+"���ģ�ʯͷ");
                break;
            case 3:
                System.out.println(ningzi+"���ģ���");
                break;
            default:
        }
        return renchuquan;
    }
}
