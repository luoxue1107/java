package Jan19;

import java.io.*;

public class Test {

    private static InputStream is;

    public static void main ( String[] args ) {
        OutputStream os = null;
        BufferedOutputStream bos = null;
        InputStream is = null;
        try {
            System.out.println ("0.0");
            //输出字节流
            os = new FileOutputStream ( "IO\\C.txt" );
            bos = new BufferedOutputStream ( os );
            byte[] bytes1 = new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
            bos.write ( bytes1 );
            bos.flush ();
            //---------------------------------
            //输入字节流
            is = new FileInputStream ( "IO\\C.txt" );
            byte[] bytes = new byte[4];
            int read = 0;

            //循环输出流引进的数组
            for (; ; ) {
                read = is.read ( bytes );
                if (read == -1) break;
                for (int i = 0; i < read; i++) {
                    System.out.print ( (char) bytes[i] );
                }
                System.out.println ();
            }
            //抛出IO异常
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {

                if (is != null) {
                    is.close ();
                }
                if (bos != null) {
                    os.close ();
                }
            } catch (IOException e) {

            }
        }
    }
}
