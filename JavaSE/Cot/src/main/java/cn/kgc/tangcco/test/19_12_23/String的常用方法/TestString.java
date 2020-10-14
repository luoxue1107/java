package My;

import java.util.Locale;

public class TestString {
    public static void main ( String[] args ) {
        String s1="abc";
        String s2="abc";
        String s4="123456";
        String s5="HelloWorld！！";
        String s3=new String ( "abc" );
        System.out.println (s1==s2);
        //new对象的字符串跟等号后面“”的地址是不一样的
        System.out.println (s1==s3);

        for (int i=0;i<s4.length ();i++) {
            System.out.println (s4.charAt (i));
        }
        //判断当前字符串中是否包含输入的字符 返回布尔类型
        System.out.println (s5.contains ( "a" ));

        //字符串的长度
        System.out.println (s5.length ());

        //字符串的从某个下标开始 查这字符 返回下标
        System.out.println (s5.indexOf ( 'b',1 ));

        //从下标0 开始查 字符 返回下标
        System.out.println (s5.indexOf ( 'o' ));

        //将字符串转换为 字符类型的数字
        char[] chars=s5.toCharArray ();
        for (int i=0;i<chars.length;i++){
            System.out.println (chars[i]);
        }

        //查找一组字符串在当前字符串中 最后一次出现的下标； 下标是查找字符串的 首个字符的下表；
        System.out.println (s5.lastIndexOf ( "llo" ));

        //去掉字符串的前后的空格  字符与字符中间的空格不会被去掉
        String s6="              a       b             ";
        System.out.println (s6.trim ());

        //把字符串中的所以小写转成大写；
        System.out.println (s5.toUpperCase ());
        System.out.println (s5.toUpperCase ( Locale.CHINA));

        //判断字符是否 是这个字符串结尾；
        System.out.println (s5.endsWith ( "！" ));

        //将旧字符串换成新字符串 原字符串 不会改变；
        System.out.println (s5.replace ("o" ,"123456" ));

        //把字符串拆分为多个 用字符串类型数组保存 注意根据什么字符拆分 就会把什么字符移除；
        String s7="public,static,void,main";
        String[] s= s7.split ( "," );
        for (int k=0;k<s.length;k++){
            System.out.println (s[k]);

        }
        //HelloWorld 取字符串中一段字符；从下标几开始到下标几结束
        String S=s5.substring ( 4, 9);
        System.out.println (S);
        //字符串长度是否为零
        System.out.println (s5.isEmpty ());
    }
}
