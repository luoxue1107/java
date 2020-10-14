public class T2DArray {
    public static void main(String[] args) {
        //二维数组两种写法
        int[][]arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=11;
        arr[1][1]=12;
        arr[1][2]=13;

        arr[2][0]=21;
        arr[2][1]=22;
        arr[2][2]=23;
    int[][]arr2={{1,2,3},{11,12,13},{21,22,23}};
    pintln(arr2);
    pintln(arr);
    }
    public static void pintln(int [][]n){
        for (int i=0;i<n.length;i++){
            for(int k=0;k<n[i].length;k++){
                System.out.print(n[i][k]+"\t");
            }
            System.out.println();
        }

    }
}
