import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������4λ��Ա��");
        int Vip = input.nextInt();
        int Y = Vip/100%10;
        //"Math.random();" ��ֵ��0~1֮�� ���С���������10 �����õõ���С����ǰ��һλ
         double D = Math.random();
        //�������int������ ǿ��ת��Ϊ������java����û����������� С�����λȫ�����
        System.out.println('Y'+Y);
        System.out.println('D'+(int)D);
        if (Y == D){
            System.out.println("�н���");
        }else {
            System.out.println("лл�ݹ�");
        }

    }
}