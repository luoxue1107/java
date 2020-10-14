import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        //菱形代码
        int figure=0;
        //这是是先把录入数字输出 后判断
        do{
            System.out.println("请输入：");
             figure=input.nextInt();
             //这里 是把录入的进来的值判断
        }while (figure %2 == 0);
        //这是 把录入进来的进行变量
        int up=figure/2+1;
        int below =figure/2;
        //这是 第一部分 等腰三角
        for (int i = 1 ;i <= up ; i++){
            //这里 的up-1是因为 倒直角要比 等腰少一行
            for (int j = up-1; j >= i ; j--){
                System.out.print("#");
            }
            for (int k = 1 ;k <= i*2-1;k++){
                System.out.print("*");
            }
            //这里 是进行换行
            System.out.println();
    }
        //这是第二部分 倒等腰三角 这里我把整个行数的循环都倒过来了
        for (int i = below;i>=1;i-- ){
            for (int j = below;j >= i;j--){
                System.out.print("#");
            }
            for (int k = 1;k <= i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
