	import java.util.Scanner;

	public class t14 {
	    public static void main(String[] args) {
	        Scanner shuRu = new Scanner(System.in);
	        //��������
	        int shuZu[] = {32, 24, 2, 4, 21, 45, 74, 58,};
	        //����һ��gang�� ֵΪ0
	        int gang = 0;
	        //������ĸ�ֵ i<shuZu.length ����˼�� i ҪС������ĳ��� length�ǳ��ȵ���˼
	        for (int i = 0; i < shuZu.length; i++) {
	            //ѭ������������ֵ ֱ����ֵ���ܳ������鳤�ȵ����ֵ
	            System.out.print(shuZu[i] + " ");
	            //��gang=gang+shuZu[zhi] �ļ�д
	            gang += shuZu[i];
	        }
	        System.out.println("");
	        System.out.println("�ܺ�" + gang);
	        System.out.println("�������������");
	        int shuZi = shuRu.nextInt();
	        //��xһ��0��ֵ
	        int x = 0;
	        for (int i = 0; i < shuZu.length; i++) {
	            //������������ֵ �����������ֵ
	            if (shuZi == shuZu[i]) {
	                //x�����1���ֵ
	                x = 1;
	                    break;
	                }
	        }
	        //���x����1�˾ͻ�������
	        if (x == 1) {
	                    System.out.println("�����ҵ��������");
	                    //������������
	                } else {
	                    System.out.println("�Ҳ����������");

	                }

	        }
	    }