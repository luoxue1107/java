import java.util.Scanner;

public class y1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //分数最高
//        double num = 0.0;
//        Scanner input = new Scanner(System.in);
//        for (int i = 1; ; i++) {
//            System.out.println("输入第" + i + "分数");
//            double num1 = input.nextDouble();
//            if (num1 >= 0 && num1 <= 150) {
//                if (num < num1) {
//                    num = num1;
//                } else if (num1 <= 0) {
//                    System.out.println("最高得分：" + num);
//                    break;
//                }
//            }
//        }




        //整数各个位数相加和
//        Scanner input = new Scanner(System.in);
//        int num = 0;
//        int num2 = 0;
//        System.out.println("输入：");
//        int num1 = input.nextInt();
//
//        do {
//            num = num1 % 10;
//            num2 += num;
//            num1 = num1 / 10;
//        } while (num1 != 0);
//        System.out.println(num2);





//        //空心菱形
//        Scanner input = new Scanner(System.in);
//        System.out.println("高：");
//        int sc=input.nextInt();
//
//        int num = sc/2;
//        int num2 = (sc/2)+1;
//        for (int i = 0; i < num; i++) {
//            //一个倒三角
//            for (int j = num; j > i; j--) {
//                //输出0
//                System.out.print(" ");
//            }
//            //正三角
//            for (int j = 1; j <= 2 * (i + 1) - 1; j++) {
//                //判断J变量循环里第一*个 和最后一*个的位置 和i变量循环最后一个行的位置
//                if (j == 1 || j == 2 * (i + 1) - 1) {
//                    System.out.print("*");
//                    // 未完成输入0
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            //换行
//            System.out.println("");
//        }
//
//        for (int i = 0; i <= num2; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            //一行的0和*的循环
//            for (int j =0; j<(2*num2)-(2*i); j++) {
//                //判断第一次 和最后一次的位置
//                if (j ==0||j==(2*num2)-(2*i)-2) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println("");
//        }

//
//        //判断是否能构成三角形
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入三个数判断是否构成三角形");
//        int num3=0;
//        int num2=0;
//        int num1=0;
//        do {
//            num1=input.nextInt();
//            num2=input.nextInt();
//            num3=input.nextInt();
//        }while (num1<0&&num2<0&&num3<0);
//        for (int i=0;i<3;i++) {
//            if (num1>num2&&num1>num3){
//                if (num1>(num2+num3)){
//                    System.out.println("可以构成三角形");
//                }else {
//                    System.out.println("不可构成三角形");
//                }
//            }else  if (num2>num3&&num2>num1){
//                if (num2>(num1+num3)){
//                    System.out.println("可以构成三角形");
//                }else {
//                    System.out.println("不可构成三角形");
//                }
//            }else if(num3>num1&&num3>num2){
//                if (num3>(num1+num2)){
//                    System.out.println("可以构成三角形");
//                }else{
//                    System.out.println("不可构成三角形");
//                }
//            }
//        }
//        int num=5;
//        String [] name=new String[num];
//        double [] grade=new double[num];
//        for (int i=0;i<num;i++){
//           String names=input.next();
//           name[i]=names;
//           double grades=input.nextDouble();
//           grade[i]=grades;
//        }
//        double value=0.0;
//        for (int i=0;i<num;i++){
//            value+=grade[i];
//        }
        int a=(int)(Math.random()*100);
        System.out.println(a);

    }
}

