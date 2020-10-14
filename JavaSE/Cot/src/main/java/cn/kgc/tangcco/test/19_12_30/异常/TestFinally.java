package My;

public class TestFinally {
    public static void main ( String[] args ) {
        System.out.println (m1 ( 2 ));
    }
    public static int m1(int n){
        try {
            if (n % 2 ==0 ){
                return 10;
            }
        } catch (Exception e) {
            return 20;
        }finally {
            //无论有没有异常都执行finally；
            System.out.println ("执行中");
        }
        return 30;
    }
}
