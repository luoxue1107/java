import java.util.Scanner;

public class YangHui {
    //杨辉三角
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入：");
        int extent = input.nextInt();
        int[][] arr = new int[extent][];
        //控制低维长度
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
        }
        //基础值赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        //计算
        for (int i = 2; i < arr.length; i++) {
            for (int k = 1; k < i; k++) {
                arr[i][k] = arr[i - 1][k - 1] + arr[i - 1][k];
            }
        }
        print(arr);
    }
    public static void print(int[][]n){
        for(int i=0;i<n.length;i++){
            for(int j = n.length-1;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<n[i].length;k++){
                System.out.print(n[i][k]+" ");
            }
            System.out.println();
        }
    }
}
