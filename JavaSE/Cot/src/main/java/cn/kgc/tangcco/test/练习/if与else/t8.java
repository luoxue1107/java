package drill;

import java.util.Scanner;

public class t8{
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("输入你的考试成绩看看你会到什么礼物：");
    int chengji = input.nextInt();
    if (chengji==100){
        System.out.println("爸爸给他买辆车");
    	}else if (chengji>=90){
    		System.out.println("妈妈给他买MP4");
    	}else if (chengji>=60){
    		System.out.println("妈妈给他买本参考书");
    	}else if (chengji<60){
    		System.out.println("不买东西 而且还要男女混合双打!");
    	}else {
    		System.out.println("妈妈给她买本参考书!");
    	}
	}
}