package cn.kgc.tangcco.day01.tang01;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 实现管理员工类功能
 * @date 2020/9/1 23:24
 */
public class EmployeeManagerTest {

    static Scanner input = new Scanner(System.in);

    /**
     *new 管理员工对象
     */
    static EmployeeManager e = new EmployeeManager();

    /**
     *主方法
     * @param args
     */
    public static void main(String[] args) {
        print();
    }

    /**
     * 页面
     */
    public static void print() {
        System.out.println("<<<<<<<<<<<<唐城员工管理系统>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[1]员工入职>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[2]员工列表>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[3]查询员工>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[4]员工离职>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[0]退出系统>>>>>>>>>>>>>>");
        System.out.print("输入：");
        switch (input.nextInt()) {
            case 1:
                addEmployee();
                break;
            case 2:
                showAllEmployee();
                break;
            case 3:
                queryEmployee();
                break;
            case 4:
                deleteEmployee();
                break;
            case 0:
               return;
            default:
                System.out.println("输入有误");


        }
        print();
    }

    /**
     * 入职
     */
    private static void addEmployee() {
        System.out.print("请输入姓名:");
        String name = input.next();
        System.out.print("请输入工号:");
        String no = input.next();
        System.out.print("1.班主任 2.教员 3.部门经理");
        int ins = input.nextInt();
        switch (ins) {
            case 1:
                add01(name, no, ins);
                break;
            case 2:
                add02(name, no, ins);
                break;
            case 3:
                add03(name, no, ins);
                break;

            default:
                System.out.println("输入有误");
                addEmployee();

        }

    }

    /**
     * 职业 1班主任
     * @param name
     * @param no
     * @param ins
     */
    private static void add01(String name, String no, int ins) {
        boolean b = e.addEmployee(new Teacher(name, no, ins));
        if (b) {
            System.out.println("存储成功");
            System.out.println("是否继续 y继续 按任意键返回");
            if ('y'==input.next().charAt(0)){
                addEmployee();
            }else {
                print();
            }
        } else {
            System.out.println("存储失败");
            addEmployee();
        }
    }

    /**
     * 职业 2教员
     * @param name
     * @param no
     * @param ins
     */
    private static void add02(String name, String no, int ins) {
        boolean b = e.addEmployee(new Instructor(name, no, ins));
        if (b) {
            System.out.println("存储成功");
            System.out.println("是否继续 y继续 按任意键返回");
            if ('y'==input.next().charAt(0)){
                addEmployee();
            }else {
                print();
            }
        } else {
            System.out.println("存储失败");
            addEmployee();
        }
    }

    /**
     * 职业 3 部门经理
     * @paam name
     * @param no
     * @param ins
     */
    private static void add03(String name, String no, int ins) {
        System.out.println("项目经理的奖金:");
        double bonus = input.nextDouble();
        boolean b = e.addEmployee(new Manager(name, no, ins, bonus));
        if (b) {
            System.out.println("存储成功");
            System.out.println("是否继续 y继续 按任意键返回");

            if ('y'==input.next().charAt(0)){
                addEmployee();
            }else {
                print();
            }
        } else {
            System.out.println("存储失败");
            addEmployee();
        }
    }

    /**
     * 查看所有员工信息
     */
    public static void showAllEmployee() {
        e.showAllEmployee();
    }

    /**
     * 以员工名字 查找员工
     */
    public static void queryEmployee() {
        System.out.println("请输入你想查的名字（可以模糊查找）");
        e.queryEmployee(input.next());
        System.out.println("是否继续 y继续 按任意键返回");
        if ('y'==input.next().charAt(0)){
            queryEmployee();
        }else {
            print();
        }
    }

    /**
     * 删除离职员工信息
     */
    public static void deleteEmployee() {
        System.out.println("请输入离职的员工编号:");
        e.deleteEmployee(input.next());
        System.out.println("是否继续 y继续 按任意键返回");

        if ('y'==input.next().charAt(0)){
            deleteEmployee();
        }else {
            print();
        }
    }
}

