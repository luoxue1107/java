package cn.kgc.dao;

import cn.kgc.pojo.Clazz;
import cn.kgc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 18:37
 */
@Repository
public class StudentDaoImpl implements StudentDao{
   @Autowired
    private Student student;

    @Override
    public List<Clazz> getClazzList() {
        return student.getClazzList();
    }
}
