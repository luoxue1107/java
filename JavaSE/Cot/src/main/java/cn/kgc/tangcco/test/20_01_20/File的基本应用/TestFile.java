package Jan20;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main ( String[] args ) throws IOException {
        File file = new File ( "IO\\C.txt" );

        //System.out.println ( file.canWrite () );//可写的
        //System.out.println ( file.canRead () );//可读的
        //System.out.println ( file.canExecute () );//可执行的
        //file.delete ();//删除
        //System.out.println(file.createNewFile ());//找不到文件的时会自动创建新文件
        //System.out.println (file.exists ());//文件名和路径是否存在
        //System.out.println (file.getName ());//文件名
        //System.out.println (file.getParent ());//目录名
        //System.out.println (file.getPath ());//文件的上一个路径名
        //System.out.println (file.getAbsolutePath ());//文件的路径名
        //System.out.println (file.getTotalSpace ()/1024/1024/1024);//路径盘的大小
        //System.out.println (file.getFreeSpace ()/1024/1024/1024);//盘的可以空间
        //System.out.println (file.isHidden ());//文件是否时隐藏文件
        //System.out.println (file.isFile ());//文件是否时普通文件
        //System.out.println (file.isDirectory ());//文件是否时目录
        //System.out.println ((System.currentTimeMillis ()-file.lastModified ())/1000/60);//文件修改时间
        //file.mkdir ();//创建目录夹
        //file.renameTo ( new File ( "IO\\L.txt" ) );//重新命名

    }
}
