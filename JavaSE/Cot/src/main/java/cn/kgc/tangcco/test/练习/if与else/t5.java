import java.util.Scanner;

public class t5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("�㿼�˶��ٷ֣�");
        int fengshu = input.nextInt();
        if (fengshu<90){
            System.out.println("�ͻ�õ��ҵ�һ��������ӣ�������");
        } else {
            System.out.println("�͵õ��ҵ���Ʒ��������");
        }
    }
}
