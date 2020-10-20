package cn.kgc.tangcco.utils.io.file;

import java.io.File;

/**
 * @author 李昊哲
 * @Description
 * @create 2020/9/8 下午3:11
 */
public abstract class BaseFiltUtil {
    /**
     * @param file
     */
    public static void delete(File file) {
        // 生成File[]数组 listFiles()方法获取当前目录里的文件夹 文件
        File[] files = file.listFiles();
        // 判断是否为空 //有没有发现讨论基本一样
        if (files != null) {
            // 遍历
            for (File file2 : files) {
                // 是文件就删除
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    // 是文件夹就递归
                    delete(file2);
                    // 空文件夹直接删除
                    file2.delete();
                }
            }
        } else {
            file.delete();
        }
    }

    /**
     * @param file
     */
    public static void show(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        System.out.println("文件>>>" + file2.getAbsolutePath());
                    } else if (file2.isDirectory()) {
                        System.out.println("目录>>>" + file2.getAbsolutePath());
                        // 递归调用
                        show(file2);
                    }
                }
            }
        } else {
            System.out.println("文件不存在");
        }
    }
}
