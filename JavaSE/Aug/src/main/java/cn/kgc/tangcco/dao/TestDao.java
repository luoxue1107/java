package cn.kgc.tangcco.Test.dao;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/28 15:15
 */
public interface TestDao {

    //返回两数中的最大值
    public int max(int number1, int number2);

    //打印学生所有信息
    public void showInfo(int sid, String name, int age, String phoneNumber);

    //录入学生5门课程成绩，分数>=0 && 分数<=150
    public double[] scores();

    //求出学生的平均值（每科成绩不能小于0，不能大于150,不满足条件输出分数信息错误并返回-1）
    public double avg(double[] d);

    /* 根据学生成绩判断是否能上大学：
     *  循环输入5门课的成绩，统计总分，根据分数判断是否可以上大学
     * 每一门课程分数最大150
     * 总分<300分、不能进入大学
     * 总分300-400分 大专
     * 总分401-500分 三本大学 * 总分501-625分 二本大学
     * 总分626-750分 一本大学 */
    public void toSchool(double[] d);

    /* 求圆柱体的底面积、侧面积、表面积、体积，并打印出来
     * 底面积：π * r * r * 侧面积：2 × π × r × h
     * 表面积： 底面积*2 + 侧面积 * 体积：π * r*r * h * 参数：
     * π 用3.14表示 * r：半径 * h:高 */
    public void cylinder(double r, double h);

    //手动实现System.arrayCopy拷贝数组（不能用原有方法）
    public void arrayCopy(Object[] arr, int star, Object[] arr2, int start2, int  length);

    //手动实现Arrays.copyOf(不能用原有方法)
    public Object[] copyOf(Object[] arr,int index);
    //手动实现数组排序(不能用原有方法)
     public int[] sort(int[] arr);
    public Object[] mergeArr(Object[] o1, Object[] o2);
}
