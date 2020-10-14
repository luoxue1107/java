package Jan18;

import java.io.*;

public class Test {
    public static void main ( String[] args ) throws IOException {
        //输出字节流
        OutputStream os = new FileOutputStream ( "IO\\D.txt" );
        //字节转换字符流
        OutputStreamWriter sw = new OutputStreamWriter ( os,"GBK" );//编码格式
        //包一层 还行打印流
        PrintWriter pw = new PrintWriter ( sw );
        pw.println ( "世界你好" );
        pw.println ( "HelloWorld" );
        pw.close ();

        //输入字符流
        InputStream is = new FileInputStream ( "IO\\D.txt" );
        //转换字节成字符流
        InputStreamReader sr = new InputStreamReader ( is,"GBK" );//编码格式
        //包一层 换行流
        BufferedReader br = new BufferedReader ( sr );
        String s;
        for (; ; ) {
            //一次 一行
            s = br.readLine ();
            if (s == null) break;
            System.out.println ( s );
        }
    }
}
