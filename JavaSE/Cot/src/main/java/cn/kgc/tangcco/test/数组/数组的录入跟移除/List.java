import java.util.*;

public class List{
   // 创建一个原数组 在类中写变量需要写static
    static String[]nums = new String[5];
    //有效元素的个数， 也是无效元素下标
    static int size = 0;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        for (;;){
        System.out.print("输入1.(添加)2.(删除)3.(更换)4.(查看)：");
        int c=input.nextInt();
        switch(c){
            case 1:
            for (;;) {
                print();
                System.out.print("（初始编号为“0”）输入编号：");
                int b = input.nextInt();
                System.out.println();
                if (b<0){
                    break;
                }
                System.out.print("录入值输入：");
                String k = input.next();
                System.out.println();
                insert(b, k);
                print();
                System.out.println("--------------------");
            }
            System.out.println("返回主页");
            continue;
            case 2:
                for (;;) {
                    print();
                    System.out.println("请输入你想删除的编号");
                    int b = input.nextInt();
                    if (b<0) {
                        break;
                    }
                    remove(b);
                }
                System.out.println("返回主页");
                continue;
            case 3:
                for(;;){
                print();
                System.out.print("请输入要更改的编号：");
                int b =input.nextInt();
                System.out.println();
                    if (b<0) {
                        break;
                    }
                System.out.print("请输入重新录入的值：");
                String k =input.next();
                System.out.println();
                change(b,k);
                }
                System.out.println("返回主页");
                continue;
            case 4:
                print();
                continue;
            default:
                System.out.println("输入有误 请输入1~4数字");
                continue;
        }



    }
    }
    //元素的录入
    public static void insert(int position,String value){
        //进行写入的下标的判断 是否超过有效元素个数
        if(position >size||position<0){
            System.out.println("输入有误 请输入一个从0~"+size+"的整数");
            return;
        }
        //如果 数组长度跟有效元素个数 相等了 就是数组元素值满了 然后进行数组扩容
        if (nums.length==size){
            arr();
        }
        //给数组进行录入值
        for(int i = size;i > position;i--){
            //逐个赋值
            nums[i]=nums[i-1];
        }
        //元素的录入 与 存入数组中的位置
        nums[position] = value;
        size++;
    }
    //建立一个新的数组 然后把原数组地址改到新数组地址
    public static void arr(){
        //这里就像一个变量一样 把右边的地址给到左边的数组名
       nums=Arrays.copyOf(nums,nums.length*2);
    }
    //数组值的展现
    public static void print(){
            for (int i=0;i<size;i++){
                System.out.print("编号"+i+":"+nums[i]+"\t");
            }
            System.out.println();
        }



        //元素的移除
    public static void remove(int position){
        if (position<0||position>size){
            System.out.println("输入有误请输入0~"+(size-1)+"的整数");
            return;
        }
        //先把想要删除的数组值赋予值为0 也可以说是一个空值
        nums[position]="0";
        /*
        然后进行逐个赋值
        从你要删除的这个元素开始 逐个把值赋予给前面 直到数组最后一个值
        因为要删除一个循环次数不能输原来的数组长度 要减一个删去的
          */
        for (int i=position;i<size-1;i++){
            nums[i]=nums[i+1];
        }
        //完成了上面的操作也就是已经把你想删掉的元素覆盖为0
        // 并且把删掉的元素也就是0放到最后 就需要把原长度进行减1  不减这个无效元素 输出 出来会在后面
        size--;
    }
    //元素的更换
    public static void change(int position,String value){
        if (position<0||position>size) {
            System.out.println("输入有误请输入0~"+(size-1)+"的整数");
            return;
        }
            nums[position] = value;
    }


}