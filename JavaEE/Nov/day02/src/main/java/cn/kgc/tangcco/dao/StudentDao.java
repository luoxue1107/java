package cn.kgc.tangcco.dao;


import cn.kgc.tangcco.pojo.Student;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 20:04
 */
public interface StudentDao {
    List<Student> selectAllStudent();
}
