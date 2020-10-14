package cn.kgc.tangcco.day02.utils.cryptography;

import cn.kgc.tangcco.day02.utils.cryotography.BaseCryptographyUtils;
import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 21:11
 */
public class BaseCryptographyUtilsTest {
    @Test
    public void aes() {
        String key = "liqinghualiqnghu";
        String aesEncodeHexString = BaseCryptographyUtils.aesEncodeHexString("李庆华", key);
        System.out.println(aesEncodeHexString);
        String aesDecodeHexString = BaseCryptographyUtils.aesDecodeHexString(aesEncodeHexString, key);
        System.out.println(aesDecodeHexString);
    }

    @Test
    public void des() {
        String key = "lihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhe";
        String desEncodeHexString = BaseCryptographyUtils.desEncodeHexString("李庆华", key);
        System.out.println(desEncodeHexString);
        String desDecodeHexString = BaseCryptographyUtils.desDecodeHexString(desEncodeHexString, key);
        System.out.println(desDecodeHexString);
    }
}
