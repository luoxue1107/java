package Jan20;

import java.io.File;
import java.io.FileFilter;

public class Test {
    static int c;

    public static void main ( String[] args ) {
        showAll ( new File ( "D:\\" ) );
    }

    public static void showAll ( File file ) {
        File[] files = file.listFiles ( new FileFilter () {
            @Override
            public boolean accept ( File file ) {
                //判断文件夹
                if (file.isDirectory ()) {
                    return true;
                }
                //判断 查找的文件类型
                if (file.isFile ()) {
                    if (file.getName ().endsWith ( ".class" )) {
                        return true;
                    }
                }
                return false;
            }
        } );

        //非空判断
        if (files != null) {
            for (File file1 : files) {
                //判断时文件 或 文件夹
                if (file1.isFile ()) {
                    System.out.println ( file1 );
                    //个数
                    c++;
                    System.out.println (c);
                    //如果时是文件夹 继续调用本方法 递归调用
                } else showAll ( file1 );

            }

        }
    }
}
