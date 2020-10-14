package Jan18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TestCharacter {
    public static void main ( String[] args ) throws IOException {
        //字符输出流
        FileWriter fw= new FileWriter ( "IO\\Chars.txt" );
        fw.write ( "你好世界");
        fw.close ();
        //字符输入流
        FileReader fr=new FileReader ( "IO\\Chars.txt" );
        char[] chars=new char[2];
        int n;
        while (true){
            n=fr.read ( chars);
            if (n==-1) break;
            for (int i = 0; i < n; i++) {
                System.out.print(chars[i]);
            }
            System.out.println ();
        }
        /*int c;
        int v=0;
        for (;;){
            c=fr.read ();
            if (c!=-1){
                char c1=(char) c;
                System.out.println (c1);
                chars[v]=c1;
                chars=Arrays.copyOf ( chars,chars.length+1 );
                v++;

            }else break;
        }
        System.out.println ("----------");
        String s=new String ( chars );
        System.out.println (s);*/

    }
}
