 import java.util.Scanner;

public class t3 {
public static void main (String []args) {
    //¼�����ֵ�׼��
    Scanner input= new Scanner (System.in);
    System.out.println("����4λ��Ա����");
    //��ʽ¼��
    int Vip = input.nextInt();
    //��������=Vip �������ֵĸ�λ����
    int ge = Vip%10;
    //ȡ������ֵ��ʮλ��
    int shi = Vip/10%10;
    int bai = Vip/100%10;
    int qian = Vip/1000;
    int he = ge+shi+bai+qian;

    System.out.println("��λ֮��:"+he);
    String shifou = he>20?"��":"����";
    System.out.println("�ǲ������˵��û���"+shifou);

	}
}

