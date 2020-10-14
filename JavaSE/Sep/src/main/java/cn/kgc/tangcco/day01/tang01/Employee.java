package cn.kgc.tangcco.day01.tang01;

import javax.swing.*;

/**
 * @author 李庆华
 * @Description 员工信息父类
 * @date 2020/9/1 20:52
 */
public abstract class Employee implements VIP {
    /**
     * 名字
     */
    private String name;

    /**
     * 工号
     */
    private String no;
    /**
     * 职位
     */
    private int post;

    /**
     * 抽象 工作方法
     */
    public abstract void work();

    /**
     * 无参构造
     */
    public Employee() {
    }

    /**
     * 有参构造
     * @param name 名字
     * @param no    工号
     * @param post 职位
     */
    public Employee(String name, String no, int post) {
        this.name = name;
        this.no = no;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;


    }

    @Override
    public String toString() {
        return "职位:" +post+
                "\n员工工号为:" + no +
                ", 名字:" + name;
    }
}
