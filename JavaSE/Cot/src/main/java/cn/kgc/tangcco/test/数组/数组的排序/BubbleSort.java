public class BubbleSort {

    public static void main(String[] args) {
        //冒泡排序
        int[]arr={1,2,3,4,5,6,7};
        //嵌套循环
        for (int i=0;i < arr.length-1;i++){
            for (int k=0;k < arr.length-1-i;k++){
                //判断大小
                if (arr[k]>arr[k+1]){
                    //调整位置
                    int V=arr[k];
                arr[i]=arr[i+1];
                arr[i+1]=V;
                }
            }
        }
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