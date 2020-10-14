package drill;

import java.util.Scanner;

public class y8{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		for(int i=1;i<=5;){
			System.out.print("请输入第"+i+"位学生成绩；");
			double score = input.nextDouble();
			if(score<0||score>100){
				continue;
			}
			sum+=score;
			i++;
		}
		double avg=sum/5;
		System.out.println("平均分为："+avg);
	}
}