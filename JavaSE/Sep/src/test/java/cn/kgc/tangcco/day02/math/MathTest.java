package cn.kgc.tangcco.day02.math;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 19:56
 */
public class MathTest {
    @Test
    public void test01(){
        int a= 10,b=20;
        int max = Math.max(a,b);
        int min= Math.min(a,b);
        System.out.println(max);
        System.out.println(min);
    }
    @Test
    public void test02(){
        //伪随机数
        Random random= new Random();
        for (int i = 0; i < 4; i++) {
            int nextInt= random.nextInt(10);
            System.out.println(i);
        }
    }
    @Test
    public void test03(){
        for (int i = 0; i < 4; i++) {
            //伪随机数
            int  random= (int) (Math.random()*10);
            System.out.println(random);
        }
    }
    @Test
    public void test04(){
        for (int i = 0; i < 4; i++) {
            int num = ThreadLocalRandom.current().nextInt(10);
            System.out.println(num);
        }
    }
    @Test
    public void test05(){
        String num = RandomStringUtils.randomNumeric(4);
        System.out.println(num);

    }
}
