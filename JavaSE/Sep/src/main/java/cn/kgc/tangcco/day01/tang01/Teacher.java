package cn.kgc.tangcco.day01.tang01;

/**
 * @author 李庆华
 * @Description 班主任
 * @date 2020/9/1 21:02
 */
public class Teacher extends Employee{
    /**
     *  调用父类构造
     * @param name 父类名字
     * @param no  父类工号
     * @param post 父类职位
     */
    public Teacher(String name,String no,int post){
        super(name,no,post);
    }
    /**
     *  重写父类抽象方法
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
        System.out.println("负责班级管理工作");
    }
}
