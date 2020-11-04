package cn.kgc.tangcco.service.impl;

import cn.kgc.tangcco.dao.RelationDao;
import cn.kgc.tangcco.dao.StudentDao;
import cn.kgc.tangcco.dao.impl.RelationDaoImpl;
import cn.kgc.tangcco.dao.impl.StudentDaoImpl;
import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.service.ServiceStudent;

import javax.management.relation.Relation;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:47
 */
public class ServiceStudentImpl implements ServiceStudent {
    private StudentDao studentDao = new StudentDaoImpl();

    private RelationDao stdCourseDao = new RelationDaoImpl();

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = studentDao.selectAllStudent();

        for (Student student : students) {
            //查询每个学生所选课程
            List<Course> list = stdCourseDao.selectCoursesBySid(student.getId());

            student.setCourses(list);
        }

        return students;
    }
}

