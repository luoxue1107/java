package drill;

	import java.util.Scanner;

	public class t10 {
	    public static void main(String[] args) {
	        //¼��
	        Scanner input = new Scanner(System.in);
	        System.out.println("���������ѽ�");
	        //¼��int����
	        int zong = input.nextInt();
	        System.out.println("�Ƿ�μ��Żݻ����:");
	        System.out.println("1: ��50Ԫ����2Ԫ�������¿���1ƿ");
	        System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
	        System.out.println("3����100Ԫ����10Ԫ����2�����");
	        System.out.println("4����200Ԫ����10Ԫ����1���ղ������˹�");
	        System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮ1ƿ");
	        System.out.println("0��������");
	        int  JinE = input.nextInt();

	        switch (JinE) {
	            case  1 :
	                if (zong >= 50) {
	                    System.out.println("�����ܽ�" + (zong + 2));
	                    System.out.println("�������¿���1ƿ");
	                } else {
	                    System.out.println("���㣡���ɻ���������");
	                }
	                break;

	            case 2 :
	                if (zong >= 100) {
	                    System.out.println("�����ܽ�" + (zong + 3));
	                    System.out.println("����500ml����1ƿ");
	                }else {
	                    System.out.println("���㣡���ɻ���������");
	                }
	                break;
	            case 3 :
	                if (zong >= 100) {
	                    System.out.println("�����ܽ��" + (zong + 10));
	                    System.out.println("����2�����");
	                }else {
	                    System.out.println("���㣡���ɻ���������");
	                }
	                break;
	            case  4 :
	                if (zong>=200) {
	                    System.out.println("�����ܽ��" + (zong + 10));
	                    System.out.println("����1���ղ������˹�");
	                }else {
	                    System.out.println("���㣡���ɻ���������");
	                }
	                break;
	            case 5 :
	                if (zong>=200) {
	                    System.out.println("�����ܽ��" + (zong + 20));
	                    System.out.println("����ŷ����ˬ��ˮ1ƿ");
	                }else {
	                    System.out.println("���㣡���ɻ���������");
	                }
	                break;
	            case  0 :
	                System.out.println("лл�ݹ�");
	                break;
	            default:
	                System.out.println("�Բ���û�д�ѡ��!");
	        }
	    }
	}