package cn.kgc.tangcco.day02.cryptography;

import cn.hutool.core.codec.Base64;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:35
 */
public class UrlTest {
    @Test
    public void test01(){
        String content = "李庆华";
        try{
            String encode =URLEncoder.encode(content,"UTF-8");
            System.out.println(encode);
            String decode= URLDecoder.decode(encode,"UTF-8");
            System.out.println(decode);
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void test02(){
        String content = "李庆华";
        String encode= Base64.encode(content);
        System.out.println(encode);
        byte[] decode= Base64.decode(encode);
        System.out.println(new String(decode));
    }
}
