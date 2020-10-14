package cn.kgc.tangcco.day02.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 20:58
 */
public class StringTest02 {
    @Test
    public void test01() {
        char[] value = {'l', 'o', 'v', 'e'};
        // 利用构造方法生成字符串
        String string01 = new String(value);
        System.out.println(string01);
        // 利用valueOf法生成字符串
        String string02 = String.valueOf(value);
        System.out.println(string01);
    }

    @Test
    public void test02() {
        // contains字符串中是否包含另外一个字符串返回值为布尔类型
        String str01 = "我爱你中国";
        // true
        System.out.println(str01.contains("我爱你"));
        // false
        System.out.println(str01.contains("伟大"));
    }

    @Test
    public void test03() {
        // indexOf字符串中是否包含另外一个字符串第一次出现的index
        String str01 = "abcbcbe";
        // 1
        System.out.println(str01.indexOf("bc"));
        // -1
        System.out.println(str01.indexOf("d"));
        // 3
        System.out.println(str01.lastIndexOf("bc"));
    }

    @Test
    public void test04() {
        String str01 = "abcbcbe";
        // charAt根据indexh获取该位置上字符的值
        System.out.println(str01.charAt(3));
        // length获取字字符串长度
        System.out.println(str01.length());
        System.out.println(str01.charAt(30));
    }

    @Test
    public void test05() {
        String str01 = "刘晓兰";
        for (int i = 0; i < str01.length(); i++) {
            System.out.println(str01.charAt(i));
        }
    }

    @Test
    public void test06() {
        String str01 = "刘晓兰";
        char[] stringArray = new char[str01.length()];
        for (int i = 0; i < str01.length(); i++) {
            stringArray[i] = str01.charAt(i);
        }
        char[] newStringArray = new char[stringArray.length];
        for (int i = 0, j = stringArray.length - 1; i < newStringArray.length; i++, j--) {
            newStringArray[i] = stringArray[j];
        }
        String s = new String(newStringArray);
        System.out.println(s);
    }

    @Test
    public void test07() {
        String str01 = "刘晓兰";
        char[] stringArray = new char[str01.length()];
        for (int i = 0; i < str01.length(); i++) {
            stringArray[i] = str01.charAt(i);
        }
        char[] newStringArray = new char[stringArray.length];
        for (int i = 0; i < newStringArray.length; i++) {
            newStringArray[i] = stringArray[stringArray.length - 1 - i];
        }
        String s = new String(newStringArray);
        System.out.println(s);
    }

    @Test
    public void test08() {
        String str01 = "刘晓兰";
        String str02 = "";
        for (int i = str01.length() - 1; i >= 0; i--) {
            str02 += str01.charAt(i);
        }
        System.out.println(str02);
    }

    @Test
    public void test09() {
        String str01 = "abc";
        String str02 = str01.toUpperCase();
        System.out.println(str02);
    }

    @Test
    public void test10() {
        String str01 = "ABC";
        String str02 = str01.toLowerCase();
        System.out.println(str02);
    }

    @Test
    public void test11() {
        String str01 = "L刘o晓v兰E";
        String str02 = "l刘O晓V兰e";
        String str03 = toLowerCase(str01);
        String str04 = toUpperCase(str02);
        System.out.println(str03);
        System.out.println(str04);
    }

    public String toLowerCase(String text) {
        if (text == null) {
            // 如果参数为空则返回null
            return null;
        }
        // 声明字符数组存储字符数组
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            // 将字符串中的字符存储到数组中
            chars[i] = text.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            // 遍历字符数组 获取每个字符并将其转为int类型
            int code = text.charAt(i);
            if (code >= 65 && code <= 90) {
                //
                char c = (char) (code + 32);
                chars[i] = c;
            }
        }
        return new String(chars);
    }

    public String toUpperCase(String text) {
        if (text == null) {
            // 如果参数为空则返回null
            return null;
        }
        // 声明字符数组存储字符数组
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            // 将字符串中的字符存储到数组中
            chars[i] = text.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            // 遍历字符数组 获取每个字符并将其转为int类型
            int code = text.charAt(i);
            if (code >= 97 && code <= 122) {
                //
                char c = (char) (code - 32);
                chars[i] = c;
            }
        }
        return new String(chars);
    }

    @Test
    public void test12() {
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase(65));
        System.out.println(Character.toUpperCase(97));
        System.out.println(Character.toUpperCase('a'));
    }


    @Test
    public void test13() {
        String str01 = "我爱你中国";
        try {
            byte[] bytesUtf8 = str01.getBytes("UTF-8");
            String str02 = new String(bytesUtf8, "GBK");
            System.out.println(str02);
            byte[] gbks = str02.getBytes("GBK");
            String str03 = new String(gbks, "UTF-8");
            System.out.println(str03);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
