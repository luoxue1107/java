
	import java.util.Arrays;
	import java.util.Scanner;

	public class t15 {
	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        System.out.println("请输入5个同学的成绩：");
	        int shuzu[]=new int[5];
	        for (int i=0;i<shuzu.length;i++){
	            shuzu[i] =input.nextInt();
	        }
	        System.out.print("排序前：");
	        for(int i=0;i<shuzu.length;i++){
	            System.out.print(shuzu[i]+" ");
	        }
	        System.out.println("");
	        //数组排序
	        Arrays.sort(shuzu);
	        System.out.print("排序后：");
	        for (int i=0;i<shuzu.length;i++){
	            System.out.print(shuzu[i]+" ");
	        }
	    }
	}
	                //数组中求最大值得方法
	                // 方法一

	        class y2 {
	            public static void main(String[] args) {
	                Scanner input= new Scanner(System.in);
	                System.out.println("输入你的成绩");
	                int arr[]=new int[6];
	                for (int i=1;i<arr.length;i++){
	                    System.out.print("第"+i+"科：");
	                    arr[i]=input.nextInt();
	                }
	                Arrays.sort(arr);
	                System.out.println("高成绩"+arr[arr.length-1]);
	            }
	}
	                //方法二

	            class y3 {
	                public static void main(String[] args) {
	                    //录入键盘输入代码
	                    Scanner input = new Scanner(System.in);
	                    //建立数组名称 跟数组分多少份
	                    int arr[] = new int[6];
	                    //建立一个“jilu”初始值等于数组的编号0
	                    int jilu = arr[0];
	                    System.out.println("输入你的成绩");
	                    // 循环
	                    for (int i = 0; i < arr.length; i++) {
	                        //键盘输入数值给到数组
	                        arr[i]=input.nextInt();
	                        //如果 数组中大于“jilu”这个值   jilu将会跟比它大的这个值相等
	                        if (arr[i] > jilu) {
	                            jilu = arr[i];
	                        }
	                    }System.out.println("冠军："+jilu);
	                }
	}
	class y4{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int arr[] = new int[4];
	        System.out.println("请输入四家店的价格：");
	        for (int i =0 ; i < arr.length; i++) {
	            System.out.print(i);
	            arr[i] = input.nextInt();
	        }
	        //数组中的值自行从小到大排列
	        Arrays.sort(arr);
	        //然后取数组中编号0的值 也就是最低的值
	        System.out.println(arr[0]);
	    }
	}
	class y5 {
	    public static void main(String[] args) {
	        char arr[] = {'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
	        System.out.print(" 原字符序列：");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print("升序排列：");
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print("逆序排列");
	        /*这里的的是i等于的数组长度 数组有多少分区i就等于多少
	         后面减一的的意思是 数组编号是从0开始 而不是从1开始 所以要减去1
	         i大于等于0 意思是i的最小值不能小于0
	          i--意思是i-1 在这里的意思就是 每循环一次 i的值都会减1
	         */
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i]+" ");
	        }

	    }
	}

