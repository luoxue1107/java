package drill;

import java.util.Scanner;

public class y3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入：");
		int money=input.nextInt();
		if( money >= 500){
			System.out.println("一");
		}else if(money >= 300){
			System.out.println("二");
		}else if(money >= 100){
			System.out.println("三");
		}else if(money >= 50){
			System.out.println("四");
		}else if(money >= 20){
			System.out.println("五");
		}else if(money >= 10){
			System.out.println("六");
		}else if(money >= 5){
			System.out.println("七");
		}else if(money >= 1){
			System.out.println("八");
		}
		System.out.println("结束");
	}
}
