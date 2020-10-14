package My;

import java.math.BigDecimal;
    //精确的小数运算

public class TestBigDecimal {
    public static void main ( String[] args ) {
        BigDecimal bigDecimal = new BigDecimal ( "2.7" );
        BigDecimal bigDecimal2 = new BigDecimal ( "1.7" );
        BigDecimal r = bigDecimal.add ( bigDecimal2 );
        System.out.println ( r );
        BigDecimal r1 = bigDecimal.subtract ( bigDecimal2 );
        System.out.println ( r1 );
        BigDecimal r2 = bigDecimal.multiply ( bigDecimal2 );
        System.out.println ( r2 );
        //除法有些除不开 需要精确到小数点后几位，还有位数的取舍；
        BigDecimal r3 = bigDecimal.divide ( bigDecimal2 ,10,BigDecimal.ROUND_UP);
        System.out.println ( r3 );
    }
}
