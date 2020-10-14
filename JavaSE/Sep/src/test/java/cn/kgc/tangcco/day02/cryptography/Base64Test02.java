package cn.kgc.tangcco.day02.cryptography;

import cn.hutool.core.codec.Base64;
import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:17
 */
public class Base64Test02 {
    @Test
    public void test01(){
        //base64 一般用于图片解析 将图片转为base64字符串后的文件为增加三分之一的大小
        String content = "李庆华";
        String encode= Base64.encode(content);
        System.out.println(encode);
        byte[] decode = Base64.decode(encode);
        System.out.println(new String(decode));
    }
}
