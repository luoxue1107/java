package cn.kgc.service;

import cn.kgc.pojo.Department;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 17:19
 */
public interface DepartmentService {
   List<Department> getDepartmentList();
   Integer deleteDepartment(Integer id);
   Integer deleteDepartments(Integer[] integers);
   Integer setDepartment(Department department);
   Integer addDepartment(Department department);
   Department getDepartmentById(Integer id);
}
