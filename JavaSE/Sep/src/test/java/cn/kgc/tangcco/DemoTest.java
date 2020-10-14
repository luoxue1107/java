package cn.kgc.tangcco;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/27 21:44
 */
public class DemoTest {
    public static void main(String[] args) {
        int ins=128;
        //为什么这个ins2值是没有变 Integer 不是引用类型吗?
        Integer ins2= new Integer(128);
        test01(ins,ins2);
        System.out.println(ins+"+"+ins2);
    }
    public static void test01(int ins, Integer ins2){
        ins =200;
        ins2=200;
    }
}
