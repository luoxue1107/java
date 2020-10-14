package cn.kgc.tangcco.day01;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/1 10:19
 */
public class Test01 {
    @org.junit.Test
    public void test01() {
        String str01 = "a里的撒手锏B里c";
        String str02 = "aBc";
        String str03 = str01.toLowerCase();
        System.out.println(str03);
//        String str04 = str01.toUpperCase();
//        System.out.println(str04);
//        System.out.println(str01(str01));

    }

    public String str01(String str) {
        if (str != null) {
            String str01 = "";
            char[] chars = new char[str.length()];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = str.charAt(i);
                int ints = (int) chars[i];
                if (ints >= 65 && ints <= 90) {
                    //大写
                    chars[i] = (char) (ints + 32);
                } else if (ints >= 97 && ints <= 112) {
                    chars[i] = (char) (ints - 32);
                    //小写
                }
            }

            for (int i = 0; i < chars.length; i++) {
                str01 += chars[i];
            }
            return str01;
        }
        return null;
    }
}
