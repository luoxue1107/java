package cn.kgc.tangcco.day02.cryptography;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:44
 */
public class AesTest {
    @Test
    public void test01(){
        String code = "李庆华";
        //密钥
        byte[] key= new String("liqinghualiqingh").getBytes();
        //建构
        SymmetricCrypto aes=  new SymmetricCrypto(SymmetricAlgorithm.AES,key);
        //加密
        byte[] encrypt=aes.encrypt(code);
        System.out.println(new String(encrypt));
        //解密
        byte[] decrypt= aes.decrypt(encrypt);
        System.out.println(new String(decrypt));



        //加密为16进制表示
        String encryptHex= aes.encryptHex(code);
        System.out.println(encryptHex);
        //解密为字符串
        String decryptStr= aes.decryptStr(encrypt, CharsetUtil.CHARSET_UTF_8);
        System.out.println(decryptStr);
    }
}
