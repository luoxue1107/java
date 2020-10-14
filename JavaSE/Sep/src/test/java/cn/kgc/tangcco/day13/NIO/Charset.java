package cn.kgc.tangcco.day13.NIO;

import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 22:47
 */
public class Charset {

    @Test
    public void test01(){
        //显示当前的默认字符编码集
        System.out.println(java.nio.charset.Charset.defaultCharset());
        //显示支持所有字符串编码集
        System.out.println(java.nio.charset.Charset.availableCharsets());

    }
}
