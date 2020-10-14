package cn.kgc.tangcco.Test.dao.impl;

import cn.kgc.tangcco.Test.dao.TestDao;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/28 15:23
 */
public class TestDaoImpl implements TestDao {
    public Scanner input = new Scanner(System.in);

    /**
     * 返回两数中的最大值
     *
     * @param number1 int
     * @param number2 int
     * @return 最大
     */
    @Override
    public int max(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    /**
     * //打印学生所有信息
     *
     * @param sid
     * @param name        名字
     * @param age         年龄
     * @param phoneNumber 电话
     */
    @Override
    public void showInfo(int sid, String name, int age, String phoneNumber) {
        System.out.println("sid:" + sid + ",name:" + name + ",age:" + age + ",phoneNumber:" + phoneNumber);
    }

    /**
     * 录入学生5门课程成绩，分数>=0 && 分数<=150
     *
     * @return
     */
    @Override
    public double[] scores() {
        double[] doubles = new double[5];
        for (int i = 0; i < doubles.length; i++) {
            System.out.print("输入第" + (i + 1) + "门成绩>>>");
            double grade = input.nextDouble();
            if (grade >= 0 && grade <= 150) {
                doubles[i] = grade;
            } else {
                System.out.println("输入有误：");
            }

        }

        return doubles;
    }

    /**
     * 求出学生的平均值（每科成绩不能小于0，不能大于150,不满足条件输出分数信息错误并返回-1）
     *
     * @param d 成绩
     * @return 平均数
     */
    @Override
    public double avg(double[] d) {

        double count = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= 0 && d[i] <= 150) {
                count += d[i];
            } else {
                return -1;
            }

        }
        return count;
    }

    /**
     * * 根据学生成绩判断是否能上大学：
     * *  循环输入5门课的成绩，统计总分，根据分数判断是否可以上大学
     * * 每一门课程分数最大150
     * * 总分<300分、不能进入大学
     * * 总分300-400分 大专
     * * 总分401-500分 三本大学 * 总分501-625分 二本大学
     * * 总分626-750分 一本大学
     *
     * @param d
     */
    @Override
    public void toSchool(double[] d) {
        double count = 0;

        for (int i = 0; i < d.length; i++) {
            if (d[i] >= 0 && d[i] <= 150) {
                count += d[i];
            }
        }

        if (count<=750 || count>=626){
            System.out.println("一本大学");
        }else if(count <=625 || count>=501){
            System.out.println("二本大学 ");
        }else if(count <=500 || count>=401){
            System.out.println("三本大学 ");
        }else if (count <=400 || count>=300){
            System.out.println("大专");
        }else {
            System.out.println("不可以进大学");
        }

    }

    /**
     *      * 求圆柱体的底面积、侧面积、表面积、体积，并打印出来
     *      * 底面积：π * r * r * 侧面积：2 × π × r × h
     *      * 表面积： 底面积*2 + 侧面积 * 体积：π * r*r * h * 参数：
     *      * π 用3.14表示 * r：半径 * h:高
     * @param r
     * @param h
     */
    @Override
    public void cylinder(double r, double h) {

       double acreage1 =(r * r*Math.PI);
       double acreage2= ((2*r)*Math.PI)*h;
       double acreage3=acreage1*2+acreage2;
       double  volume= acreage1*h;
        System.out.println("圆柱体的底面积:"+acreage1+"、侧面积:"+acreage2+"、表面积:"+acreage3+"、体积:"+volume);
    }

    /**
     * //手动实现System.arrayCopy拷贝数组（不能用原有方法）
     * @param arr
     * @param star
     * @param arr2
     * @param start2
     * @param length
     */
    @Override
    public void arrayCopy(Object[] arr, int star, Object[] arr2, int start2, int length) {
            // 临时数组存储被拷贝的值
            Object[] temp = new Object[length];
            for (int i = 0; i < length; i++) {
                // 备份源数组中欲被拷贝的元素的值
                temp[i] = arr[i + star];
            }
            for (int i = 0; i < length; i++) {
                // 将备份的数据存储到目标数组的指定index位置上
                arr2[i + start2] = temp[i];
            }
        }

    /**
     *  //手动实现Arrays.copyOf(不能用原有方法)
     * @param arr
     * @param index
     * @return
     */
    @Override
    public Object[] copyOf(Object[] arr, int index) {
        Object[] ints = new Object[index];
        if (ints.length <= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (i < index) {
                    ints[i] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                ints[i] = arr[i];
            }
        }
        return ints;
    }

    /**
     * //手动实现数组排序(不能用原有方法)
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //比较 下标i元素 跟后位元素比较 最小的存到下标i里
                if (arr[i] > arr[j]) {
                    //如何下标0比下标1大 那就把下标0的元素临时存起来
                    int count = arr[i];
                    //把下标1的元素 存到下标0里
                    arr[i] = arr[j];
                    //最后把临时存起来的值赋给下标1
                    arr[j] = count;
                }
            }
        }
        return arr;
    }

    /**
     * //合并数组
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public Object[] mergeArr(Object[] o1, Object[] o2) {
        int count=o1.length + o2.length;
        Object[] obj =new Object[count];
        for (int i = 0; i < obj.length ; i++) {
            obj[i]=o1[i];
            if (i >=o1.length-1){
                obj[i]=o2[i];
            }
        }

        return obj;
    }
}
