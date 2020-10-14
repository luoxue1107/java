import java.util.Scanner;

public class t4 {
	    public static void main(String [] args){
	        System.out.println("***********消费单**********");
	        int txu = 245;
	        int wangxie = 570;
	        int wangpai =320;
	        int zong =txu+wangpai+wangxie;
	        Scanner input= new Scanner(System.in);
	        System.out.println("购买物品\t单价\t个数\t金额");
	        System.out.println("T恤    \t￥"+ txu+"\t2    \t"+txu*2);
	        System.out.println("网球鞋\t￥"+wangxie+"\t1    \t"+wangxie*1);
	        System.out.println("网球拍\t￥"+wangpai+"\t1    \t"+wangpai*1);
	        System.out.println("                     ");
	        System.out.println("折扣：8折");
	        System.out.println("消费总金额:\n￥"+zong);
	        System.out.println("实际交费:\n￥");
	        double zhe = zong/100*80;
	        int jiaofei = input.nextInt();
	        double zhaoling = jiaofei- zhe;
	        System.out.println("找零:\n￥"+zhaoling);
	    }
	}

