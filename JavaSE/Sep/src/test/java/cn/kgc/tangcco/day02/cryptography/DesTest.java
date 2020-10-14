package cn.kgc.tangcco.day02.cryptography;

import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import org.junit.Test;

import java.sql.SQLOutput;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:24
 */
public class DesTest {
    @Test
    public void test01(){
        String code = "李庆华";
        //密钥
        byte[] key = new String("liqinghhualiqinghhualiqinghhualiqinghhualiqinghhualiqinghhualiqinghhua").getBytes();
        SymmetricCrypto des= new SymmetricCrypto(SymmetricAlgorithm.DES,key);
        byte[] encrypt=des.encrypt(code);
        System.out.println(new String(encrypt));
        byte[]  decrypt= des.decrypt(encrypt);
        System.out.println(new String(decrypt));



        String encryptHex= des.encryptHex(code);
        System.out.println(encryptHex);
        String  decryptStr=des.decryptStr(encryptHex);
        System.out.println(decryptStr);
    }
}
