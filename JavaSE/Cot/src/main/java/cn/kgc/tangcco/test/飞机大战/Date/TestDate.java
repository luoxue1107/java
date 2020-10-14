package Date;

import java.util.Date;

/**
 * Date 日期类
 */
public class TestDate {
    public static void main ( String[] args ) {
        Date date = new Date ();
        System.out.println ( date );
        for (int i = 0; i < 1000; i++) {
            System.out.println (i);
        }
        Date date1 =new Date (  );
        System.out.println (date1.getTime ()-date.getTime ());//结束毫秒减去开始毫秒等于运行时间、
        System.out.println (date.compareTo ( date1 ));
        System.out.println (date1.after ( date ));
    }
}
