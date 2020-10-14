package cn.kgc.tangcco.day01.tang01;

/**
 * @author 李庆华
 * @Description 部门经理
 * @date 2020/9/1 21:02
 */
public class Manager extends Employee {
    /**
     * 奖金
     */
    private double bonus;

    /**
     * 重写父类抽象方法
     */
    @Override
    public void work() {
        System.out.println("负责整个部门的管理工");
    }

    /**
     * 重写接口方法
     */
    @Override
    public void vip() {
        System.out.println("没有VIP服务");
    }


    public Manager(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 调用父类构造方法
     * @param name 名字
     * @param no 工号
     * @param post 职位
     * @param bonus 奖金
     */
    public Manager(String name, String no, int post, double bonus) {
        super(name, no, post);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
