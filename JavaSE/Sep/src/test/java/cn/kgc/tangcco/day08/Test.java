package cn.kgc.tangcco.day08;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/8 19:19
 */
public class Test {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[5];
        //定义计数器
        boolean b = false;
        int count = 0;

        //外层循环创建生成随机数
        for (int i = 0; i < 10; i++) {
            int temp = (int) (Math.random()*10)+1;

            //内层循环比较随机数是否与数组数据相同
            for (int j = 0; j < arr.length; j++) {
                //如果不相同则使判断器为true
                if (temp != arr[j]) {
                    b = true;
                } else {//如果相同则使判断器为false,并结束循环
                    b = false;
                    break;
                }
            }
            //判断是否能将随机数写入数组
            while (b) {
                //设定写入的上限为数组的长度
                if (count == arr.length) {
                    break;
                }
                arr[count] = temp;
                //成功写入后计数器增加，并将判断器改为false
                count++;
                b = false;
            }
        }
        //遍历循环打印数组
        for (int a : arr
        ) {
            System.out.println(a);
        }
    }
}
