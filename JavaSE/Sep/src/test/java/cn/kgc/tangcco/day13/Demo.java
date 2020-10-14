package cn.kgc.tangcco.day13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/13 11:58
 */
public class Demo {
    private String str = "src/resources/pom.xml";
    private String str01 = "src/resources";

    @Test
    public void test01() {
        /**
         * 获取文件后缀名
         */
        System.out.println(FilenameUtils.getExtension(str));
    }

    @Test
    public void test02() {
        //获取文件名
        System.out.println(FilenameUtils.getName(str));
        //获取目录名
        System.out.println(FilenameUtils.getName(str01));
    }

    @Test
    public void test03() {
        //判断 文件的后缀是否是指定 后缀
        System.out.println(FilenameUtils.isExtension(str, "xml"));
        System.out.println(FilenameUtils.isExtension(str, "txt"));
        //没有文件 只有目录 则为空白
        System.out.println(FilenameUtils.isExtension(str01, ""));
    }

    @Test
    public void test04() {
        //计算文件大小
        System.out.println(FileUtils.sizeOf(new File(str)) + "字节");
        //计算目录文件大小
        System.out.println(FileUtils.sizeOfDirectory(new File("src/main")) + "字节");
    }

    @Test
    public void test05() {
        File f = new File("src");
        //查看指定路径的所有文件
        // EmptyFileFilter.NOT_EMPTY过滤器
        Collection<File> files = FileUtils.listFiles(f, EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
        for (File file :
                files) {
            System.out.println(file.getAbsolutePath());
        }

        // DirectoryFileFilter.INSTANCE 下级文件
        System.out.println("+++++++++++++++++++++++++++");
        files = FileUtils.listFiles(f, EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
        for (File file :
                files) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("+++++++++++++++++++++++++++++");
        //查看后缀名为java的文件
        files = FileUtils.listFiles(f, new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
        for (File file :
                files) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        //可以同时查看class和java的文件 FileFilterUtils 判断条件
        files = FileUtils.listFiles(f, new SuffixFileFilter("java"), new SuffixFileFilter("xml"));
        for (File file :
                files) {
            System.out.println(file.getAbsolutePath());
        }

    }

    @Test
    public void test06() throws IOException {
        File file = new File(str);

        FileUtils.write(file, "bbbbbbbbbbbbbbbbbb");
        FileUtils.writeStringToFile(new File(str), "ddddddddddd", true);
    }

    @Test
    public void test07() throws IOException {
        //拷贝文件
        FileUtils.copyFile(new File(str), new File("src/resources/pom.txt"));
        //拷贝文件到另一个目录
        FileUtils.copyFile(new File("Sep.iml"), new File("src/resources/"));
        //指定目录拷贝到另一个路径下
        FileUtils.copyDirectoryToDirectory(new File(str01), new File("src/main"));
        //把指定目录下的文件 拷贝到另一个目录下
        FileUtils.copyDirectory(new File("src/resources"), new File("src/main"));
    }
}
