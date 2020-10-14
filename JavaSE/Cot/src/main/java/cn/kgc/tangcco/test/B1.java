import java.util.*;

public class B1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        input.next().charAt(0);
//        int num;
//        for (;;){
//            System.out.println("输入：");
//            num =input.nextInt();
//            for (int i = 1 ;i<=num;i++){
//                for (int j =num-1; j >=i; j--) {
//                    System.out.print(" ");
//                }
//                for (int y =1;y <=i ;y++ ){
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }
//            if (num<=0) {
//                break;
//            }
//        }
//        int num=1;
//        int num1=input.nextInt();
//        for (int i=num1;i>=1;i--){
//            System.out.println(i+"*"+num);
//            num*=i;
//        }
//        System.out.println(num);


//        System.out.println("高：");
//        int num1=input.nextInt();
//        System.out.println("宽：");
//        int num2=input.nextInt();
//        for(int i=1;i<=num1;i++){
//            if (i==1||i==num1){
//                for (int j=1;j<=num2;j++){
//                    System.out.print("O");
//                }
//                System.out.println("");
//            }else {
//                System.out.print("O");
//                for (int j=1;j<=num2-2;j++){
//                    System.out.print(" ");
//                }
//                System.out.println("O");
//            }
//        }

//        int num = input.nextInt();
//        for (int i = 1; i <= num; i++) {
//            for (int k = num; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("O ");
//
//            }
//            System.out.println("");
//        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("0");
            }
            System.out.print("*");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("0");
            }
            System.out.println("*");
        }

    }
}
/*
00000*     1-0
0000*0*    2-1
000*000*   3-3
00*00000*  4-5
0*0000000* 5-7
*
 */