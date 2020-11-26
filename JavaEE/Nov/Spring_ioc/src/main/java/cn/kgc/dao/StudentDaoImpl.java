package cn.kgc.dao;

import cn.kgc.pojo.Clazz;
import cn.kgc.pojo.Student;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/25 19:47
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private Clazz clazz;

    @Override
    public void getStudent() {
        List<Student> studentList = clazz.getStudentList();
        studentList.forEach(student-> System.out.println(JSON.toJSONString(student)));
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
