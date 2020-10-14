import java.util.Arrays;
class JDkSort{
    //Arrays.sort工具自动排序
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        pint(arr);
    }
    //输出函数
    public static void pint(int[]n){
        for (int i= 0;i<n.length;i++){
            System.out.print(n[i]+"\t");
        }
        System.out.println();
    }
}
