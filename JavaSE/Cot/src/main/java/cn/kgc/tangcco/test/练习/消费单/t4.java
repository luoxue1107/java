import java.util.Scanner;

public class t4 {
	    public static void main(String [] args){
	        System.out.println("***********���ѵ�**********");
	        int txu = 245;
	        int wangxie = 570;
	        int wangpai =320;
	        int zong =txu+wangpai+wangxie;
	        Scanner input= new Scanner(System.in);
	        System.out.println("������Ʒ\t����\t����\t���");
	        System.out.println("T��    \t��"+ txu+"\t2    \t"+txu*2);
	        System.out.println("����Ь\t��"+wangxie+"\t1    \t"+wangxie*1);
	        System.out.println("������\t��"+wangpai+"\t1    \t"+wangpai*1);
	        System.out.println("                     ");
	        System.out.println("�ۿۣ�8��");
	        System.out.println("�����ܽ��:\n��"+zong);
	        System.out.println("ʵ�ʽ���:\n��");
	        double zhe = zong/100*80;
	        int jiaofei = input.nextInt();
	        double zhaoling = jiaofei- zhe;
	        System.out.println("����:\n��"+zhaoling);
	    }
	}

