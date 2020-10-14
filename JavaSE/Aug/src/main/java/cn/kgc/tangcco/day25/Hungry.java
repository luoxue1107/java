package cn.kgc.tangcco.day25;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/25 19:59
 */
public class Hungry {
    /**
     * 实例化对象
     */
    private static Hungry instance = new Hungry();

    /**
     * 私有化构造方法
     */
    private Hungry() {
    }

    /**
     * 公开的方法的取出对象
     */
    public static Hungry getInstance() {
        return instance;
    }
}
