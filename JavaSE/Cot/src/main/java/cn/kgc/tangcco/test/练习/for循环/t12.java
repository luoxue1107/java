package drill;

	import java.util.Scanner;

	public class t12 {
	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        System.out.print("�������������:");
	        String Ningzi = input.next();
	        System.out.println("           ");
	        double ZongFen=0;
	        for (int JiKe=1;JiKe<=7;JiKe++){
	            System.out.print("�������"+JiKe+"�ſ�");
	            double FengShu=input.nextInt();
	            ZongFen+=FengShu;
        }
	        System.out.println("ƽ���֣�"+ZongFen/7);
	        }
}