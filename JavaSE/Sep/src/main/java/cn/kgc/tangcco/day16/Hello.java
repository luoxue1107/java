package cn.kgc.tangcco.day16;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/17 9:05
 */
public class Hello{
    public static void main(String args[]) {
    }

    public Hello(long x) {
        this((int) x);
        System.out.println("a");
    }
    public Hello(int x) {
        this();
        System.out.println("b");
    }
    public Hello() {
        System.out.println("c");
    }
}