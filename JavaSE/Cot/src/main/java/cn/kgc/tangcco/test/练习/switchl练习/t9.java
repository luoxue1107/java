package drill;

import java.util.Scanner;

	public class t9 {
	    public  static void main(String [] args){
	        Scanner input = new Scanner(System.in);
	        System.out.println ("���Ƕ�������");

	        int mingci = input.nextInt();
	        //switch ������������� ���ͻ����ַ��� �ı��ʽ
	        switch (mingci){
	            case 1:
	            System.out.println("����10000Ԫ");
	            //bresk ������ֹͣ��� ��˼�������������ֹͣ�˲����ٿ��������
	            break;
	            case 2:
	                System.out.println("����5000");
	                break;
	            case 3:
	                System.out.println("����1000Ԫ");
	                break;
	            default :
	                System.out.println("�����κν���");


	        }
	    }
	}
