package drill;

    import java.util.Scanner;

public class t11 {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.print("�ϸ�����");
			String Shifou= input.next() ;
		while (Shifou.equals("buhege")) {
			System.out.println("���ϸ� �ͼ���ѧϰ");
			System.out.println("��ʦ�Һϸ�����");
			Shifou = input.next();
		}
		while (Shifou.equals("hege")) {
			System.out.println("�ϸ� ����ѧϰ");
			Shifou = input.next();
		}
			System.out.println("��������");
		}
}