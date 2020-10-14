package cn.kgc.tangcco.day01;

import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/1 11:32
 */
public class Test02 {
    @Test
    public void test01() {
        String str = "qwer";
        char[] chars = str.toCharArray();
        for (char c: chars
             ) {
            System.out.print(c);
        }

    }
}
