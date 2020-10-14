package cn.kgc.tangcco.day03;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/3 20:15
 */
public class Test {
@org.junit.Test
    public void test04() {
        for (int i = 0; i < 4; i++) {
            int num = ThreadLocalRandom.current().nextInt(10);
            System.out.print(num);
        }
    }

}
