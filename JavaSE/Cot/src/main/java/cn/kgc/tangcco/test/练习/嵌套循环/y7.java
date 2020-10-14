import java.util.Scanner;

public class y7{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
			System.out.println("请输入你的人数：");
			int x = input.nextInt();
		double sum = 0;
		for(int i=1;i<=x;){
			System.out.println("请输入第"+i+"位");
			double b=input.nextDouble();
			if(b<=0||b>150){
				System.out.println("输入有误请重新输入；");
				//返回
				continue;
			}
			sum+=b;
			i++;
		}
		System.out.println("平均每人为："+sum/x);
	}


}