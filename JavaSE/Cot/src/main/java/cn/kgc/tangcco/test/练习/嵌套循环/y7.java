import java.util.Scanner;

public class y7{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
			System.out.println("���������������");
			int x = input.nextInt();
		double sum = 0;
		for(int i=1;i<=x;){
			System.out.println("�������"+i+"λ");
			double b=input.nextDouble();
			if(b<=0||b>150){
				System.out.println("�����������������룻");
				//����
				continue;
			}
			sum+=b;
			i++;
		}
		System.out.println("ƽ��ÿ��Ϊ��"+sum/x);
	}


}