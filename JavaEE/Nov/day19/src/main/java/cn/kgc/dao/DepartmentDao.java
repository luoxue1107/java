package cn.kgc.dao;

import cn.kgc.pojo.Department;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 15:17
 */
public interface DepartmentDao {
    List<Department> selectDepartment();
    Integer insertDepartment(Department department);
    Integer deleteDepartmentDyId(Integer id);
    Integer updateDepartment(Department department);
    Department selectDepartmentById(Integer id);
    Integer[] deleteDepartments(Integer[] integers);
}
