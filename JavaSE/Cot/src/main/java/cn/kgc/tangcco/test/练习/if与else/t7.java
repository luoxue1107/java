package drill;

import java.util.Scanner;

public class t7 {	
	    public  static void main(String [] args){

	        Scanner input = new Scanner(System.in);
	        System.out.println("��Ĺ���ȡ������ʲô����");
	        System.out.println('��');
	        int gozi = input.nextInt();
	        if (gozi>=500){
	           System.out.println("������򱼳�");
	        }else if (gozi>=100) {
	            System.out.println("���������");
	        }else if (gozi>=50) {
	            System.out.println("�������ݱ�");
	        }else if (gozi>=10) {
	            System.out.println("�����������");
	        }else if (gozi<10) {
	            System.out.println("����������");
	       }

	 }
}
