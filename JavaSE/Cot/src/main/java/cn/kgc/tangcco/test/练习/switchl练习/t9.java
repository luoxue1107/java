package drill;

import java.util.Scanner;

	public class t9 {
	    public  static void main(String [] args){
	        Scanner input = new Scanner(System.in);
	        System.out.println ("你是多少名？");

	        int mingci = input.nextInt();
	        //switch 的括号里可以用 整型或者字符型 的表达式
	        switch (mingci){
	            case 1:
	            System.out.println("奖励10000元");
	            //bresk 这里是停止语句 意思就是在这里可以停止了不用再看下面的了
	            break;
	            case 2:
	                System.out.println("奖励5000");
	                break;
	            case 3:
	                System.out.println("奖励1000元");
	                break;
	            default :
	                System.out.println("不给任何奖励");


	        }
	    }
	}
