public class selectionSort{
    //选择排序
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<arr.length-1;i++){

            for(int k=i+1;k < arr.length;k++){
                //逐个比较先比较从第一开始
                if(arr[i]>arr[k]){
                    int V=arr[i];
                    arr[i]=arr[k];
                    arr[k]=V;
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
