package cn.kgc.tangcco.day01;

import cn.kgc.tangcco.day01.tang01.EmployeeManager;
import cn.kgc.tangcco.day01.tang01.Instructor;
import cn.kgc.tangcco.day01.tang01.Manager;
import cn.kgc.tangcco.day01.tang01.Teacher;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/1 21:21
 */
public class EmployeeManagerTest {
    Scanner input = new Scanner(System.in);
    EmployeeManager e=new EmployeeManager();
    @Test
    public void Test01() {
        print();

    }

    public void print() {
        System.out.println("<<<<<<<<<<<<唐城员工管理系统>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[1]员工入职>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[2]员工列表>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[3]查询员工>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[4]员工离职>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<[0]退出系统>>>>>>>>>>>>>>");

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
                break;
            default:
                System.out.println("输入有误");


        }
    }
    private void addEmployee(){
        System.out.println("请输入姓名:");
        String name =input.next();
        System.out.println("请输入工号:");
        String no = input.next();
        System.out.println("1.班主任 2.教员 3.部门经理");
        int ins= input.nextInt();
        switch (ins){
            case  1:
                add01(name,no,ins);
                break;
            case  2:
               add02(name,no,ins);
                break;
            case  3:
              add03(name,no,ins);
                break;

            default:
                System.out.println("输入有误");

        }

    }
    private void add01(String name,String no ,int ins){
        boolean b = e.addEmployee(new Teacher(name , no, ins));
        if (b){
            System.out.println("存储成功");
        }else {
            System.out.println("存储失败");
        }
    }
    private void add02(String name,String no ,int ins){
        boolean b = e.addEmployee(new Instructor(name,no,ins));
        if (b){
            System.out.println("存储成功");
        }else {
            System.out.println("存储失败");
        }
    }
    private void add03(String name,String no ,int ins){
        System.out.println("项目经理的奖金:");
        double bonus = input.nextDouble();
        boolean b =e.addEmployee(new Manager(name,no,ins,bonus));
        if (b){
            System.out.println("存储成功");
        }else {
            System.out.println("存储失败");
        }
    }
    public void showAllEmployee(){
      e.showAllEmployee();
    }
    public void queryEmployee(){
        System.out.println("请输入你想查的名字（可以模糊查找）");
        e.queryEmployee(input.next());
    }
    public void deleteEmployee(){
        System.out.println("请输入离职的员工编号:");
        e.deleteEmployee(input.next());
    }
}
