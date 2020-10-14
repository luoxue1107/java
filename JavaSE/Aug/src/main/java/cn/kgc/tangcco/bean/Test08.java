package cn.kgc.tangcco.Test.bean;


import java.util.Arrays;

/**
 * @author 李庆华
 * @Description 作业
 * 自己编写一个方法 实现Arrays.toString功能
 * 自己编写一个方法 实现Arrays.sort功能
 * 自己编写一个方法 实现Arrays.copyOf功能
 * 自己编写一个方法 System.arraycopy功能
 * 自己编写一个方法 利用自己编写System.arraycopy功能实现Arrays.copyOf功能
 * @date 2020/8/14 16:00
 */
public class Test08 {
    public static void main(String[] args) {
        int[] ints = {7, 8, 6, 5, 2, 4, 1, 6, 3, 9};
        int[] arry = new int[5];
//        sort(ints);
//        print(ints);
//        arrayCopy(ints, 0, arry, 0, 5);
//        print(arry);
//     print(copyOf2(ints,7));
//        System.out.println(Arrays.toString(ints));
        print(copyOf2(ints,20));
        print(Arrays.copyOf(ints,5));


    }

    /**
     * 打印
     *
     * @param a int类型的数组
     */
    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }

    /**
     * 排序
     *
     * @param a 一个int数组
     */
    public static void sort(int[] a) {
        //创建一个临时变量
        int count;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                //比较 下标i元素 跟后位元素比较 最小的存到下标i里
                if (a[i] > a[j]) {
                    //如何下标0比下标1大 那就把下标0的元素临时存起来
                    count = a[i];
                    //把下标1的元素 存到下标0里
                    a[i] = a[j];
                    //最后把临时存起来的值赋给下标1
                    a[j] = count;
                }
            }
        }
    }

    /**
     * 从元素下标0开始 拷贝 有反回值
     *
     * @param a      原数组
     * @param length 拷贝元素长度
     * @return 返回 一个存里拷贝元素的int数组
     */
    public static int[] copyOf(int[] a, int length) {
        int[] ints = new int[length];
        if (ints.length <= a.length) {
            for (int i = 0; i < a.length; i++) {
                if (i < length) {
                    ints[i] = a[i];
                }
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                ints[i] = a[i];
            }
        }
        return ints;
    }

    /**
     * 可控制范围 拷贝
     *
     * @param a      源数组
     * @param index  源数组 复制初始下标
     * @param index2 存数组 初始下标
     * @param length 从index元素下标起 复制的长度
     */
    public static void arrayCopy(int[] a, int index, int[] b, int index2, int length) {
        //临时存储数组
        int[] arr = new int[length];
        //把原数组 的值赋给临时数组
        for (int i = 0; i <= a.length; i++) {
            //控制元素下标到index 进行拷贝
            if (i >= index) {
                for (int j = i - index; j < arr.length; j++) {
                    //赋一个值 循环赋值退出操作
                    arr[j] = a[i];
                    break;
                }
            }
        }
        //把临时数组的值 赋给拷贝目标数组
        for (int i = 0; i < b.length; i++) {
            //控制元素下标到 index2
            if (i >= index2) {
                for (int j = i - index2; j < arr.length; j++) {
                    //赋一个值 循环赋值退出操作
                    b[i] = arr[j];
                    break;
                }
            }
        }
    }

    /**
     * 利用arraycopy完成copuOf功能
     * @param a int 数组
     * @param length  拷贝的长度
     * @return  返回一个新 int 数组
     */
    public static int[] copyOf2(int[] a, int length) {
        //临时数组
        int[] ints = new int[length];
        if (ints.length <= a.length) {
                arrayCopy(a,0,ints,0,length);
        } else {
            int[] a1= new int[length];
            a1=a;
            arrayCopy(a1,0,ints,0,a1.length);

        }
        //利用arraycopy

        return ints;
    }
}
