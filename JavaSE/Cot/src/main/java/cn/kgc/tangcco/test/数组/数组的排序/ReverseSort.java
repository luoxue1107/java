import java.util.Arrays;

public class ReverseSort {
    //将jdk工具排序 正序变成倒序
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        //工具排序
        Arrays.sort(arr);
        //循环赋值 
        for (int i = 0; i < arr.length/2; i++) {
            int gang = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = gang;
        }
            print(arr);
    }
    public static void print(int[]n){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "\t");
        }
    }
}
