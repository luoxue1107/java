package drill;


import java.util.Scanner;

public class y4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int weekDay=input.nextInt();
		switch(weekDay){
			case 1:
			System.out.println("一");
			break;
			
			case 2:
			System.out.println("二");
			break;
			
			case 3:
			System.out.println("三");
			break;
			
			case 4:
			System.out.println("四");
			break;
			
			case 5:
			System.out.println("五");
			break;
			
			case 6:
			System.out.println("六");
			break;
			
			case 7:
			System.out.println("七");
			break;
			
			default:
			System.out.println("输入有误");
			break;
		}
	}
} 
