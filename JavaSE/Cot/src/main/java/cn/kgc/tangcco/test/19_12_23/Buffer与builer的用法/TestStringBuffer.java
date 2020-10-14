package My;

public class TestStringBuffer {
    //buffer 与builder
    public static void main ( String[] args ) {
        //buffer跟builder  用法一样 取值一样 就是buffer线程安全 builder 不安全
        StringBuffer buffer=new StringBuffer ( "liqinghua" );
        buffer.append ( "@gamil.com.cn" );
        System.out.println (buffer);
        StringBuilder builder=new StringBuilder ( "liqinghua" );
        buffer.append ( "@gamil.com.cn" );
        System.out.println (builder);

    }
}
