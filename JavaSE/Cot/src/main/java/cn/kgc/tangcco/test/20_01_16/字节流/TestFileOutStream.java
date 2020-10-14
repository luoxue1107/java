package Jan16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutStream {
    public static void main ( String[] args ) throws Exception {
        //字节输出流
        FileOutputStream f1=new FileOutputStream ( "IO\\IO.txt",true );
        f1.write ( 'A' );
        byte [] bytes=new byte[]{48,49,50,51,52,53};
        //数组截取一段字节
        f1.write ( bytes,1,3 );
        //输出数组 的字节
        f1.write ( bytes );
    }
}
