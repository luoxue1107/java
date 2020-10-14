package Jan16;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main ( String[] args ) throws IOException {
        //字节输入
        FileInputStream in = new FileInputStream ( "IO\\IO.txt" );
        int n;
        //单个字节
        //n = in.read ();
        // System.out.println ( (char) n );
        /*while (true) {
            if (n != -1) {
                n = in.read ();
                System.out.println ( (char) n );
            }
        }
        */

        //数组字节输入
        byte[] bytes = new byte[10];
        while (true) {
            int m = in.read ( bytes );
            if (m == -1) {
                break;
            }
            for (int i = 0; i < m; i++) {
                System.out.print ( (char) bytes[i] + "\t" );
            }
            System.out.println ();
        }
        System.out.println ( in.markSupported () );
        System.out.println (in.skip ( 5 ));
        System.out.println ( in.available () );

    }
}
