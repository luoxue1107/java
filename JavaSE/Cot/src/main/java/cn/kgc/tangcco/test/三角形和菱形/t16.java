	import java.util.Scanner;

	public class t16 {
	    public static void main(String[] args) {
	        Scanner shuRu = new Scanner(System.in);
	        for (int b=1;b<=3;b++) {
	            int gang=0;
	            System.out.println("�������"+b+"���༶�ĳɼ�");
	            for (int i = 1; i <= 4; i++) {
	                System.out.print("��" + i + "��ѧԱ�ĳɼ���");
	                gang += shuRu.nextInt();
	            }
	            System.out.println("��"+b+"���༶����ѧԱ��ƽ�����ǣ�"+gang/4.00);
	            System.out.println();
	        }
	    }
	}
	class y17{
	    public static void main(String[] args) {
	        //ֱ�������εĵ�д��
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("������ֱ�������ε�������");
	        int f=shuRn.nextInt();
	        for (int i=1;i<=f;i++){
	            for (int b=1;b<=i;b++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
	class lianxi17{
	    public static void main(String[] args) {
	        //��ֱ�������ε�д��
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("������ֱ�������ε�������");
	        int f=shuRn.nextInt();
	        for (int i=f;i>=1;i--){
	            for (int b=1;b<=i;b++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
	class lian17{
	    public static void main(String[] args) {
	        // һ�����߾�������ֱ�������е�д��
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("������ֱ�������ε�������");
	        int f=shuRn.nextInt();
	        for (int i=1;i<=f;i++){
	            //�����b��С���ڵ��� 2�� ���� ��ȥ1 ���� �ǵĶ���
	            for (int b=1;b<=2*i-1;b++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	}
	class xi17{
	    public static void main(String[] args) {
	        //���������ε�д��
	        Scanner shuRn=new Scanner(System.in);
	        System.out.println("������������ε�������");
	        int f=shuRn.nextInt();
	        //���д�����ǰѷ�ֱ�������θ���ֱ�������� д��һ�� ��ֱ�� Ҫ��ǰ��ſ��԰� ��ֱ�� ���ɵ���������
	        for(int i=1;i<=f;i++){
	            for(int b=f-1;b>=i;b--){
	                System.out.print(" ");
	            }
	            for (int b=1;b<=2*i-1;b++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

	}
	class lianxi{
	    public static void main(String[] args) {
	        System.out.println("�˷���");
	        for (int i=1;i<=9;i++){
	            for (int b=1;b<=i;b++){
	            System.out.print(b+"x"+i+"="+b*i+"\t");
	            } System.out.println();
	        }

	    }
	}
	

