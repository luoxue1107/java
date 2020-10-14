	import java.util.Scanner;

	public class t14 {
	    public static void main(String[] args) {
	        Scanner shuRu = new Scanner(System.in);
	        //建立数组
	        int shuZu[] = {32, 24, 2, 4, 21, 45, 74, 58,};
	        //建立一个gang的 值为0
	        int gang = 0;
	        //给数组的赋值 i<shuZu.length 的意思是 i 要小于数组的长度 length是长度的意思
	        for (int i = 0; i < shuZu.length; i++) {
	            //循环输出数组里的值 直到赋值不能超过数组长度的最大值
	            System.out.print(shuZu[i] + " ");
	            //是gang=gang+shuZu[zhi] 的简写
	            gang += shuZu[i];
	        }
	        System.out.println("");
	        System.out.println("总和" + gang);
	        System.out.println("请输入这个数：");
	        int shuZi = shuRu.nextInt();
	        //给x一个0的值
	        int x = 0;
	        for (int i = 0; i < shuZu.length; i++) {
	            //如果键盘输入的值 等于数组里的值
	            if (shuZi == shuZu[i]) {
	                //x会等于1这个值
	                x = 1;
	                    break;
	                }
	        }
	        //如果x等于1了就会运行着
	        if (x == 1) {
	                    System.out.println("可已找到这个数字");
	                    //否则会运行这个
	                } else {
	                    System.out.println("找不到这个数字");

	                }

	        }
	    }