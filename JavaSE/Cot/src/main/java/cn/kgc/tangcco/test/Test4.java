import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //初始值
        int a=0;
        //键盘录入
        Scanner input=new Scanner(System.in);
        for (;;) {

            //一次录入值
            System.out.println("输入最小数：");
            int num1=input.nextInt();
            //终止判断
            if (num1<=0) {
                break;
            }
            //二次录入值
            System.out.println("输入最大数：");
            int num2= input.nextInt();
            if (num2<=num1){
                System.out.println("最大值与最小值不能相等或小于最小值");
                continue;
            }
            //循环运算 i初始值为num1 循环结束条件为大于num2
            for (int i = num1; i <= num2; i++) {
                //赋值 运算
                a=a+i;
            }
            //结果输出
            System.out.println("总和结果为："+"\t"+a);

        }

    }
}
