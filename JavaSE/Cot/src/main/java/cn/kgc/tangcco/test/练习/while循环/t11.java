package drill;

    import java.util.Scanner;

public class t11 {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.print("合格了吗：");
			String Shifou= input.next() ;
		while (Shifou.equals("buhege")) {
			System.out.println("不合格 就继续学习");
			System.out.println("老师我合格了吗？");
			Shifou = input.next();
		}
		while (Shifou.equals("hege")) {
			System.out.println("合格 继续学习");
			Shifou = input.next();
		}
			System.out.println("输入有误！");
		}
}