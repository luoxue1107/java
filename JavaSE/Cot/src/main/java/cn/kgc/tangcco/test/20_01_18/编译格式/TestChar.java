package Jan18;

import java.io.FileOutputStream;

public class TestChar {
    public static void main ( String[] args ) throws Exception {
        String s1="你是大傻逼";
        byte[] bs=s1.getBytes ( "GBK" );
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i]+"\t");
        }
        System.out.println ();
        byte[] bytes = new byte[]{-64,-18,-57,-20,-69,-86};
        String strings=new String (bytes ,"GBK" );
        System.out.println (strings);

        //输出流
        FileOutputStream fi=new FileOutputStream ( "IO\\GBK.txt" );
        fi.write ( bytes );

    }
}
