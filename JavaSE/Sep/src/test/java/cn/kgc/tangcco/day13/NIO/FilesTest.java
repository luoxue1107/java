package cn.kgc.tangcco.day13.NIO;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 23:01
 */
public class FilesTest {
    @Test
    public void test01(){
        //Files创建文件
        try {
            Path file = Files.createFile(Paths.get("src/main/resources/aa.txt"));
            System.out.println(file.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test02(){
        //Files创建目录
        try {
            Path directory = Files.createDirectories(Paths.get("src/main/resources/aa/bb"));
            System.out.println(directory.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test03() {
        //移动到指定目下并更名
        try {
            Path move = Files.move(Paths.get("src/main/resources/aa.txt"), Paths.get("src/main/resources/aa/bb/cc.txt"));
            System.out.println(move.getFileName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test04() {
        //删除指定文件
        try {
            Files.delete(Paths.get("src/main/resources/aa/bb/cc.txt"));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test05() {
        //拷贝
        try {
            Files.copy(Paths.get("pom.xml"), Paths.get("pom.txt"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test06() {
        //拷贝目录
        try {
            Files.copy(Paths.get("src/main/resources/aa/bb"), Paths.get("src/main/resources/aa/cc"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test07() {
        // 将文件以字符串的形式读出
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Paths.get("pom.xml"));
            System.out.println(new String(bytes));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test08() {
        // 将文件当作行序列读入
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("pom.xml"));
            for (int i = 0; i < lines.size(); i++) {
                System.out.print(lines.get(i));
                if (i != lines.size() -1) {
                    System.out.print("\n");
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test09() {
        // 写出一个字符串到文件中
        try {
            Files.write(Paths.get("src/main/resources/aa/cc/dd.txt"), "我爱你中国".getBytes("utf-8"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void test10() {
        test09();
        // 向指定文件中追加内容 注:这里加上APPEND表示追加字符串
        try {
            Files.write(Paths.get("resources/aa/cc/dd.txt"), "\nlove".getBytes("utf-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
