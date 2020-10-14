package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description 冒泡排序
 * @date 2020/8/19 23:07
 */
public class arraySort1 {
    public static void sort(int[] a) {
        //临时存值
        int count;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a.length-1-i; j++) {
                if (a[j+1] < a[j]) {
                    count = a[j];
                    a[j] = a[j+1];
                    a[j+1] = count;
                }
            }
        }
    }

}
