import java.util.Scanner;

public class diannao {
    String mingzi;
    int fen;
    Scanner shuru=new Scanner(System.in);
    public void diannaoming(){
        System.out.print("������Է��Ľ�ɫ��1.����2.��Ȩ3.�ܲ٣���");
        int jiaoce=shuru.nextInt();
        switch (jiaoce){
            case 1:
               mingzi="����";
                break;
            case 2:
                mingzi="��Ȩ";
                break;
            case 3:
                mingzi="�ܲ�";
                break;
            default:
                System.out.println("�������󣡣��������룺1 2 3 ");
        }
    }
    public int diancaozuo(){
        int dianchuquan=(int)(Math.random()*3);
        switch (dianchuquan){
            case 0:
                System.out.println(mingzi+"���ģ�����");
                break;
            case 1:
                System.out.println(mingzi+"���ģ�ʯͷ");
                break;
            case 2:
                System.out.println(mingzi+"���ģ���");
                break;
            default:
        }
        return dianchuquan+1;
    }
}

