package Jan16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream  {
    public static void main ( String[] args ) throws IOException {
        FileOutputStream fi=new FileOutputStream ( "IO\\BFF.txt" );
        //用缓冲 过滤流
        BufferedOutputStream bu=new BufferedOutputStream ( fi );
        bu.write ('A');
        bu.write ('B');
        bu.write ('C');
        //刷新 缓冲
        bu.flush ();
        bu.write ('D');
        bu.write ('E');
        //结束流 的同时 刷新缓冲
        bu.close ();
    }
}
