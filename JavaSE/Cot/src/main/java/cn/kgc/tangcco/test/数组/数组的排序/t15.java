
	import java.util.Arrays;
	import java.util.Scanner;

	public class t15 {
	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        System.out.println("������5��ͬѧ�ĳɼ���");
	        int shuzu[]=new int[5];
	        for (int i=0;i<shuzu.length;i++){
	            shuzu[i] =input.nextInt();
	        }
	        System.out.print("����ǰ��");
	        for(int i=0;i<shuzu.length;i++){
	            System.out.print(shuzu[i]+" ");
	        }
	        System.out.println("");
	        //��������
	        Arrays.sort(shuzu);
	        System.out.print("�����");
	        for (int i=0;i<shuzu.length;i++){
	            System.out.print(shuzu[i]+" ");
	        }
	    }
	}
	                //�����������ֵ�÷���
	                // ����һ

	        class y2 {
	            public static void main(String[] args) {
	                Scanner input= new Scanner(System.in);
	                System.out.println("������ĳɼ�");
	                int arr[]=new int[6];
	                for (int i=1;i<arr.length;i++){
	                    System.out.print("��"+i+"�ƣ�");
	                    arr[i]=input.nextInt();
	                }
	                Arrays.sort(arr);
	                System.out.println("�߳ɼ�"+arr[arr.length-1]);
	            }
	}
	                //������

	            class y3 {
	                public static void main(String[] args) {
	                    //¼������������
	                    Scanner input = new Scanner(System.in);
	                    //������������ ������ֶ��ٷ�
	                    int arr[] = new int[6];
	                    //����һ����jilu����ʼֵ��������ı��0
	                    int jilu = arr[0];
	                    System.out.println("������ĳɼ�");
	                    // ѭ��
	                    for (int i = 0; i < arr.length; i++) {
	                        //����������ֵ��������
	                        arr[i]=input.nextInt();
	                        //��� �����д��ڡ�jilu�����ֵ   jilu���������������ֵ���
	                        if (arr[i] > jilu) {
	                            jilu = arr[i];
	                        }
	                    }System.out.println("�ھ���"+jilu);
	                }
	}
	class y4{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int arr[] = new int[4];
	        System.out.println("�������ļҵ�ļ۸�");
	        for (int i =0 ; i < arr.length; i++) {
	            System.out.print(i);
	            arr[i] = input.nextInt();
	        }
	        //�����е�ֵ���д�С��������
	        Arrays.sort(arr);
	        //Ȼ��ȡ�����б��0��ֵ Ҳ������͵�ֵ
	        System.out.println(arr[0]);
	    }
	}
	class y5 {
	    public static void main(String[] args) {
	        char arr[] = {'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
	        System.out.print(" ԭ�ַ����У�");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print("�������У�");
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print("��������");
	        /*����ĵ���i���ڵ����鳤�� �����ж��ٷ���i�͵��ڶ���
	         �����һ�ĵ���˼�� �������Ǵ�0��ʼ �����Ǵ�1��ʼ ����Ҫ��ȥ1
	         i���ڵ���0 ��˼��i����Сֵ����С��0
	          i--��˼��i-1 ���������˼���� ÿѭ��һ�� i��ֵ�����1
	         */
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i]+" ");
	        }

	    }
	}

