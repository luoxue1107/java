package Jan18;

import java.io.*;

public class TestBuffered {
    public static void main ( String[] args ) throws IOException {
        //输出流
        Writer fw = new FileWriter ( "IO\\b.txt" );
        /*BufferedWriter bw = new BufferedWriter ( fw );
        bw.write ( "世界你好" );
        //换行符
        bw.newLine ();
        bw.write ( "HelloWorld" );*/
        PrintWriter pw = new PrintWriter ( fw );
        //打印一行字符
        pw.println ( "世界你好" );
        pw.println ( "HelloWorld" );
        pw.close ();
        //输入流
        Reader fr = new FileReader ( "IO\\b.txt" );
        BufferedReader br = new BufferedReader ( fr );
        String string;
        for (; ; ) {
            //输入一行字符
            string = br.readLine ();
            if (string != null) {
                System.out.println ( string );
            } else break;
        }

    }
}
