import java.util.Scanner;

/**
 * ѧ���๦���ر�ǿ��
 * @author ���컪
 * @version 1.1
 */
public class t17 {
    public static void main(String[] args) {
        Scanner shuRu=new Scanner(System.in);
        calc i=new calc();
        System.out.println("������java�ɼ���");
        i.java =shuRu.nextInt();
        System.out.println("������C�ɼ���");
        i.C =shuRu.nextInt();
        System.out.println("������DB�ɼ���");
        i.DB =shuRu.nextInt();

        System.out.println("�ܳɼ�"+i.zong());
        System.out.println("ƽ���ɼ�"+i.pingjun());
    }
}


