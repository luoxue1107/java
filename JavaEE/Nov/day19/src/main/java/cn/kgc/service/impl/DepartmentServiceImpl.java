package cn.kgc.service.impl;

import cn.kgc.dao.impl.DepartmentDaoImpl;
import cn.kgc.pojo.Department;
import cn.kgc.service.DepartmentService;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 17:21
 */
public class DepartmentServiceImpl implements DepartmentService {
 private final DepartmentDaoImpl departmentdaoImpl= new DepartmentDaoImpl();
    @Override
    public List<Department> getDepartmentList() {
        return departmentdaoImpl.selectDepartment();
    }

    @Override
    public Integer deleteDepartment(Integer id) {
        return departmentdaoImpl.deleteDepartmentDyId(id);
    }

    @Override
    public Integer deleteDepartments(Integer[] integers) {
       Integer ins=1;
       Integer[] integer = departmentdaoImpl.deleteDepartments(integers);
       for (int i = 0; i < integer.length; i++) {
           if (integer[i]<0){
              ins=0;
           }
       }
       return ins;
    }

    @Override
    public Integer setDepartment(Department department) {
       return departmentdaoImpl.updateDepartment(department);
    }

    @Override
    public Integer addDepartment(Department department) {
      return departmentdaoImpl.insertDepartment(department);
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentdaoImpl.selectDepartmentById(id);
    }
}
