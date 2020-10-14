package cn.kgc.tangcco.day02.cryptography;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:05
 */
public class ase64Test01 {
    @Test
    public void test01() {
        //获取Base64的加密对象
        Encoder encoder = Base64.getEncoder();
        //获取Base64的解密对象
        Decoder decoder = Base64.getDecoder();
        String content = "李庆华";
        try {
            byte[] encode = encoder.encode(content.getBytes("UTF-8"));
            String encodeToString = encoder.encodeToString(content.getBytes("UTF-8"));
            System.out.println(new String(encode));
            System.out.println(encodeToString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


}
