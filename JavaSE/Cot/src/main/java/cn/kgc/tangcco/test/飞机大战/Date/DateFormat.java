package cn.kgc.tangcco.test.飞机大战.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main ( String[] args ) {
        SimpleDateFormat d = new SimpleDateFormat ( "yyyy-MM-dd hh:mm:ss" );
        while (true) {
            System.out.println ( d.format ( new Date () ) );
        }
    }
}
