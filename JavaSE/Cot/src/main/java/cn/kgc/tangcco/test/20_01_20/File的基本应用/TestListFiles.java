package Jan20;

import java.io.File;
import java.io.FileFilter;

public class TestListFiles {
    public static void main ( String[] args ) {
        File file = new File ( "D:\\编程学习\\java" );
       /* String[] strings =file.list ();//获取文件夹内所以的文件名
        for (String s:
             strings) {
            System.out.println (s);
        }
*/
      /*  File[] files = file.listFiles ();//获取文件夹内的所以文件的对象
        for (File file1 : files) {
        //判断需要的文件
            if (file1.isFile ()) {
                if (file1.getName ().endsWith ( ".iml" )) {
                    System.out.println ( file1 );
                }
            }
        }     */
        //获取文件夹内的所以文件的对象 方法二
        File[] files1 = file.listFiles ( new FileFilter () {
            @Override
            //提前判断 是否满足需要
            public boolean accept ( File file1 ) {
                if (file1.isFile ()) {
                    if (file1.getName ().endsWith ( ".class" )) {
                        return true;
                    }
                }
                return false;
            }
        } );
        //打印数组
        for (File fil : files1) {
            System.out.println ( fil );
        }


    }
}
