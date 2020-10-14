package drill;

	import java.util.Scanner;

	public class t10 {
	    public static void main(String[] args) {
	        //录入
	        Scanner input = new Scanner(System.in);
	        System.out.println("请输入消费金额：");
	        //录入int整数
	        int zong = input.nextInt();
	        System.out.println("是否参加优惠换购活动:");
	        System.out.println("1: 满50元，加2元换购百事可乐1瓶");
	        System.out.println("2：满100元，加3元换购500ml可乐一瓶");
	        System.out.println("3：满100元，加10元换购2斤面粉");
	        System.out.println("4：满200元，加10元换购1个苏泊尔炒菜锅");
	        System.out.println("5：满200元，加20元可换购欧澜雅爽肤水1瓶");
	        System.out.println("0：不换购");
	        int  JinE = input.nextInt();

	        switch (JinE) {
	            case  1 :
	                if (zong >= 50) {
	                    System.out.println("消费总金额：" + (zong + 2));
	                    System.out.println("换购百事可乐1瓶");
	                } else {
	                    System.out.println("金额不足！不可换购！！！");
	                }
	                break;

	            case 2 :
	                if (zong >= 100) {
	                    System.out.println("消费总金额：" + (zong + 3));
	                    System.out.println("换购500ml可乐1瓶");
	                }else {
	                    System.out.println("金额不足！不可换购！！！");
	                }
	                break;
	            case 3 :
	                if (zong >= 100) {
	                    System.out.println("消费总金额" + (zong + 10));
	                    System.out.println("换购2斤面粉");
	                }else {
	                    System.out.println("金额不足！不可换购！！！");
	                }
	                break;
	            case  4 :
	                if (zong>=200) {
	                    System.out.println("消费总金额" + (zong + 10));
	                    System.out.println("换购1个苏泊尔炒菜锅");
	                }else {
	                    System.out.println("金额不足！不可换购！！！");
	                }
	                break;
	            case 5 :
	                if (zong>=200) {
	                    System.out.println("消费总金额" + (zong + 20));
	                    System.out.println("换购欧澜雅爽肤水1瓶");
	                }else {
	                    System.out.println("金额不足！不可换购！！！");
	                }
	                break;
	            case  0 :
	                System.out.println("谢谢惠顾");
	                break;
	            default:
	                System.out.println("对不起！没有此选项!");
	        }
	    }
	}