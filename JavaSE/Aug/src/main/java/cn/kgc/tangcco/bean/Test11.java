package cn.kgc.tangcco.Test.bean;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/24 10:13
 */
public class Test11 {
    public void test01() {
        System.out.println();
        System.out.println( System.getSecurityManager());
        System.out.println(System.currentTimeMillis()/1000);
    }

    public static void main(String[] args) {
      long l=System.currentTimeMillis();
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis()-l+"秒");

    }
}
