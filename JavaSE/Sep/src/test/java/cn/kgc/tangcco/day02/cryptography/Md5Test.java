package cn.kgc.tangcco.day02.cryptography;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:32
 */
public class Md5Test {
    @Test
    public void test01(){
        Digester md5= new Digester(DigestAlgorithm.MD5);
        String content = "李庆华";
        String  digestHex=md5.digestHex(content);
        System.out.println(digestHex);
    }
}
