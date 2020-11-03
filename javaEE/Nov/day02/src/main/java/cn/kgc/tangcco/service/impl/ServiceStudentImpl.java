package cn.kgc.tangcco.service.impl;

import cn.kgc.tangcco.dao.impl.StudentDaoImpl;
import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.service.ServiceStudent;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:47
 */
public class ServiceStudentImpl implements ServiceStudent {
    @Override
    public List<Student> getAllStudent() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
      return   studentDao.selectAllStudent();
    }
}
