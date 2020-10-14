import java.util.Scanner;
public class array{
	public static void main(String[]args){
		int he = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("输入存多少个数：");
		int b = input.nextInt();
	for(int i = 0;i<=b;i++){
		System.out.pintln("输入：");
		int[i] muns=input.nxetInt();
		
	}
	for(int i = 0; muns.length;i++){
		System.out.print(muns[i])
			he=he+muns[i];
	}
	System,out.println("和:"+he);
	System.out.println("平均："+(he/b));

	}
}