package drill;

import java.util.Scanner;

public class y3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�����룺");
		int money=input.nextInt();
		if( money >= 500){
			System.out.println("һ");
		}else if(money >= 300){
			System.out.println("��");
		}else if(money >= 100){
			System.out.println("��");
		}else if(money >= 50){
			System.out.println("��");
		}else if(money >= 20){
			System.out.println("��");
		}else if(money >= 10){
			System.out.println("��");
		}else if(money >= 5){
			System.out.println("��");
		}else if(money >= 1){
			System.out.println("��");
		}
		System.out.println("����");
	}
}
