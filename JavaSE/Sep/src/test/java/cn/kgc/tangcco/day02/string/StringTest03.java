package cn.kgc.tangcco.day02.string;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 20:58
 */
public class StringTest03 {
    @Test
    public void test01() {
        String str01 = "abcdefgh";
        // 字符串截取cdefgh
        System.out.println(str01.substring(2));
        // 前包后不包 cde
        System.out.println(str01.substring(2, 5));
    }

    @Test
    public void test02() {
        String str01 = "abcdabcd";
        String str02 = "abcdabed";
        // 字符串替换
        // ahcdahcd
        System.out.println(str01.replace("b", "h"));
        // ahcdabcd
        System.out.println(str01.replaceFirst("b", "h"));

        // ahdabed
        System.out.println(str02.replaceAll("bc", "h"));
    }

    @Test
    public void test03() {
        String str01 = "2020-09-01";
        String[] strings = str01.split("-");
        for (String text : strings) {
            System.out.println(text);
        }
    }

    @Test
    public void test04() {
        String str01 = "2020-09-01 11:22:00";
        String[] strings = str01.split(" ");
        String[] strings1 = strings[0].split("-");
        for (int i = 0; i <= strings1.length; i++) {
            switch (i) {
                case 0: {
                    System.out.print(strings1[i] + "年");
                    break;
                }
                case 1: {
                    System.out.print(strings1[i] + "月");
                    break;
                }
                case 2: {
                    System.out.print(strings1[i] + "日");
                    break;
                }
                default: {
                    System.out.print(" ");
                    break;
                }
            }
        }
        String[] strings2 = strings[1].split(":");
        for (int i = 0; i <= strings2.length; i++) {
            switch (i) {
                case 0: {
                    System.out.print(strings2[i] + "时");
                    break;
                }
                case 1: {
                    System.out.print(strings2[i] + "分");
                    break;
                }
                case 2: {
                    System.out.print(strings2[i] + "秒");
                    break;
                }
                default: {
                    System.out.print("\n");
                    break;
                }
            }
        }
    }

    @Test
    public void test05() {
        String str01 = "刘晓兰.jpg";
        System.out.println(str01.startsWith("刘"));
        System.out.println(str01.endsWith("jpg"));
    }

    @Test
    public void test06() {
        String str01 = " 刘      晓      兰";
        System.out.println(str01);
        System.out.println(str01.length());
        String str02 = str01.trim();
        System.out.println(str02);
        System.out.println(str02.length());
        String str03 = str01.replaceAll(" ", "");
        System.out.println(str03);
        System.out.println(str03.length());
        String text = "";
        for (int i = 0; i < str01.length(); i++) {
            char c = str01.charAt(i);
            String s = String.valueOf(c);
            text += s.trim();
        }
        System.out.println(text);
        System.out.println(text.length());
    }

    @Test
    public void test07() {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.length());
        uuid = uuid.replaceAll("-", "");
        System.out.println(uuid);
        System.out.println(uuid.length());
    }

    @Test
    public void test08() {
        String uuid = IdUtil.fastUUID();
        System.out.println(uuid);
        System.out.println(uuid.length());
    }

    @Test
    public void test09() {
        String uuid = IdUtil.fastSimpleUUID();
        System.out.println(uuid);
        System.out.println(uuid.length());
    }

    @Test
    public void test10() {
        String str01 = "婚礼.mp4";
        int index = str01.lastIndexOf(".");
        String extension = str01.substring(index);
        String newName = IdUtil.fastSimpleUUID() + extension;
        System.out.println(newName);
    }

    @Test
    public void test11() {
        String str01 = "婚礼.mp4";
        String newName = IdUtil.fastSimpleUUID() + str01.substring(str01.lastIndexOf("."));
        System.out.println(newName);
    }

    @Test
    public void test12() {
        String str01 = "婚礼.mp4";
        String extension = FilenameUtils.getExtension(str01);
        String newName = IdUtil.fastSimpleUUID() + "." + extension;
        System.out.println(newName);
    }

    @Test
    public void test13() {
        String str01 = "婚礼.mp4";
        String newName = IdUtil.fastSimpleUUID() + "." + FilenameUtils.getExtension(str01);
        System.out.println(newName);
    }

    @Test
    public void test14() {
        String str01 = "婚礼.mp4";
        String codePool = "0123456789ABCDEF";
        String newName = RandomStringUtils.random(32, codePool) + "." + FilenameUtils.getExtension(str01);
        System.out.println(newName);
    }

    @Test
    public void test15() {
        for (int i = 0; i < 10; i++) {
            System.out.println(RandomStringUtils.randomNumeric(6));
        }
    }

    @Test
    public void test16() {
        String str01 = "婚礼.mp4";
        String codePool = "0123456789ABCDEF";
        String fileName = "";
        for (int i = 0; i < 32; i++) {
            fileName += codePool.charAt(ThreadLocalRandom.current().nextInt(16));
        }
        fileName += "." + FilenameUtils.getExtension(str01);
        System.out.println(fileName);
    }

}
