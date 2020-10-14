import java.util.Scanner;
//创建一个叫calc的类
public class calc {
    //类的三个属性
    int java;
    int C;
    int DB;
    /*类的方法 也可以说是类的操作 这里return是返回值的意思
    它需要把java+C+Bd结果 反馈给zong
    int的意思 返回的值是整数类型
     */
    public int zong(){
        return java+C+DB;
    }
    public double pingjun(){
        return (java+C+DB)/3.0;
    }
}
//建立以个新的类
class lianxi18{
    public static void main(String[] args) {
        //键盘录入
        Scanner shuRu = new Scanner(System.in);
        //创建calc类的 对象 为i 然后用i来带入
        calc i = new calc();
        System.out.print("请输入java成绩：");
        //键盘录入的值给打 calc类中的 java这个属性
        i.java = shuRu.nextInt();
        System.out.print("请输入C成绩：");
        i.C = shuRu.nextInt();
        System.out.print("请输入DB成绩：");
        i.DB = shuRu.nextInt();
        /*这里是把 calc这个类 中的 进行反值后 zong值这个输出
        输出 类方法 不要忘记 方法名称 后面加括号
         */
        System.out.println("总成绩:" + i.zong());
        System.out.println("平均成绩:" + i.pingjun());
    }
}
