	import java.util.Scanner;

	public class t16 {
	    public static void main(String[] args) {
	        Scanner shuRu = new Scanner(System.in);
	        for (int b=1;b<=3;b++) {
	            int gang=0;
	            System.out.println("请输入第"+b+"个班级的成绩");
	            for (int i = 1; i <= 4; i++) {
	                System.out.print("第" + i + "个学员的成绩：");
	                gang += shuRu.nextInt();
	            }
	            System.out.println("第"+b+"个班级参赛学员的平均分是："+gang/4.00);
	            System.out.println();
	        }
	    }
	}
	class y17{
	    public static void main(String[] args) {
	        //直角三角形的的写法
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("请输入直角三角形的行数：");
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
	        //反直角三角形的写法
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("请输入直角三角形的行数：");
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
	        // 一三五七九这样的直角三角行的写法
	        Scanner shuRn=new Scanner(System.in);
	        System.out.print("请输入直角三角形的行数：");
	        int f=shuRn.nextInt();
	        for (int i=1;i<=f;i++){
	            //这里的b是小于于等于 2乘 行数 减去1 等于 星的多少
	            for (int b=1;b<=2*i-1;b++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	}
	class xi17{
	    public static void main(String[] args) {
	        //等腰三角形的写法
	        Scanner shuRn=new Scanner(System.in);
	        System.out.println("输入等腰三角形的行数：");
	        int f=shuRn.nextInt();
	        //这个写法就是把反直角三角形跟正直角三角形 写到一起 反直角 要在前面才可以把 正直角 挤成等腰三角形
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
	        System.out.println("乘法表");
	        for (int i=1;i<=9;i++){
	            for (int b=1;b<=i;b++){
	            System.out.print(b+"x"+i+"="+b*i+"\t");
	            } System.out.println();
	        }

	    }
	}
	

