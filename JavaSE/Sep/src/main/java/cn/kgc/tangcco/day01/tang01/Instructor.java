package cn.kgc.tangcco.day01.tang01;

/**
 * @author 李庆华
 * @Description 教员类
 * @date 2020/9/1 21:02
 */
public class Instructor extends Employee{
    /**
     *  调用父类有参构造方法
     * @param name 父类名字
     * @param no 父类工号
     * @param post 职位
     */
    public Instructor(String name,String no,int post){
        super(name,no,post);
    }

    /**
     * 重写父类抽象方法
     */
    @Override
    public void work() {
        System.out.println("负责班级管理工作");
    }

    /**
     * 重写接口方法
     */
    @Override
    public void vip() {
        System.out.println("课后辅导、作业检查");
    }
}
