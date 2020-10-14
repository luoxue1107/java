package cn.kgc.tangcco.day01.tang01;

/**
 * @author 李庆华
 * @Description 管理成员类的接口
 * @date 2020/9/1 21:15
 */
public interface EmployeeManagerDao {
    //员工入职
    public boolean addEmployee(Employee employee);
    //显示所有员工列表
    public void showAllEmployee();
    //模糊查询员工
    public void queryEmployee(String name);
    //员工离职
    public boolean deleteEmployee(String no);
}
