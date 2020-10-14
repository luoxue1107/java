package cn.kgc.tangcco.day25;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/25 20:07
 */
public class Lazy {
    private  static Lazy instance = null;
    private Lazy(){}

    public static Lazy getInstance() {
        if (instance==null){
            instance=new Lazy();
        }
        return instance;
    }
}
