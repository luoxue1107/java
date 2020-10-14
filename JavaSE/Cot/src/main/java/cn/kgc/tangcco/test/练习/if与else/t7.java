package drill;

import java.util.Scanner;

public class t7 {	
	    public  static void main(String [] args){

	        Scanner input = new Scanner(System.in);
	        System.out.println("你的工资取决你买什么车：");
	        System.out.println('万');
	        int gozi = input.nextInt();
	        if (gozi>=500){
	           System.out.println("你可以买奔驰");
	        }else if (gozi>=100) {
	            System.out.println("你可以买宝马");
	        }else if (gozi>=50) {
	            System.out.println("你可以买捷豹");
	        }else if (gozi>=10) {
	            System.out.println("你可以买速腾");
	        }else if (gozi<10) {
	            System.out.println("不建议你买车");
	       }

	 }
}
