package cn.kgc.tangcco.day01.tang01;

/**
 * @author 李庆华
 * @Description 管理员工
 * @date 2020/9/1 21:13
 */
public class EmployeeManager implements EmployeeManagerDao {

    /**
     * 储存数组
     */
    static Employee[] employees = new Employee[100];

    /**
     * 入职员工
     * @param employee 员工对象
     * @return 是否成功
     */
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 查看全部员工信息
     */
    @Override
    public void showAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                String str = "";
                switch (employee.getPost()) {
                    case 1:
                        str = "班主任";
                        break;
                    case 2:
                        str = "教员";
                        break;
                    case 3:
                        str = "部门经理";
                        break;
                    default:
                        str="错误";
                }


                System.out.println("职位:" + str + "\n名字" + employee.getName() +
                        "\n工号" + employee.getNo());
                switch (employee.getPost()) {
                    case 1 -> {
                        Teacher teacher = (Teacher) employee;
                        teacher.work();
                        teacher.vip();
                        System.out.println("");
                    }
                    case 2 -> {
                        Instructor instructor = (Instructor) employee;
                        instructor.work();
                        instructor.vip();
                        System.out.println("");
                    }
                    case 3 -> {
                        Manager manager = (Manager) employee;
                        manager.work();
                        manager.vip();
                        System.out.println("");
                    }
                    default -> {System.out.println("有误");}
                }
            }
        }

    }

    /**
     * 输入姓名查询员工
     * @param name 姓名
     */
    @Override
    public void queryEmployee(String name) {
        try {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].equals(name)) {
                    System.out.println(employees[i]);
                } else if (employees[i].getName().charAt(0) == name.charAt(0)) {
                    System.out.println(employees[i].getName());
                    break;
                } else {
                    System.out.println("没有找到");
                }

            }

        } catch (NullPointerException e) {
        }
    }

    /**
     * 离职人员
     * @param no 工号
     * @return 是否成功
     */
    @Override
    public boolean deleteEmployee(String no) {
        if (no != null) {
            for (int i = 0; i < employees.length; i++) {

                if (no.equals(employees[i].getNo())) {
                    employees[i] = null;
                    System.arraycopy(employees, i, employees, i, employees.length - i);
                    return true;
                }
            }
        }
        return false;
    }
}
