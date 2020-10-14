public class ChengeLength {
    public static void main(String[] args) {
        arraY(1,2,3,4,5,6,7,8,9,0);
    }
    //可变长参数
    public static void arraY(int...n){
        for (int i=0;i<n.length;i++){
        System.out.println(n[i]);
    }
    }
}
