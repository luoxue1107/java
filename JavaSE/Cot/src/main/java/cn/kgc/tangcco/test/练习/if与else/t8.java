package drill;

import java.util.Scanner;

public class t8{
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("������Ŀ��Գɼ�������ᵽʲô���");
    int chengji = input.nextInt();
    if (chengji==100){
        System.out.println("�ְָ���������");
    	}else if (chengji>=90){
    		System.out.println("���������MP4");
    	}else if (chengji>=60){
    		System.out.println("��������򱾲ο���");
    	}else if (chengji<60){
    		System.out.println("������ ���һ�Ҫ��Ů���˫��!");
    	}else {
    		System.out.println("��������򱾲ο���!");
    	}
	}
}