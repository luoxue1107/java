package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 20:12
 */
public class Tes01 {
    public static void main(String[] args) {
        Husband.name = "SB";
        Husband.age = 10;
        Wife.name = "SB2";
        Wife.age = 8;

        System.out.println(Husband.showlnfo());
        System.out.println(Wife.showlnfo());
    }
}
