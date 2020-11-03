package cn.kgc.tangcco.service.impl;

import cn.kgc.tangcco.dao.impl.CourseDaoImpl;
import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.ServiceCourse;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:43
 */
public class ServiceCourseImpl implements ServiceCourse {
    @Override
    public List<Course> getAllCourses() {
        CourseDaoImpl courseDao = new CourseDaoImpl();
        return courseDao.selectAllCourse();
    }

    @Override
    public Course getCourseById(Integer id) {
        CourseDaoImpl courseDao = new CourseDaoImpl();
        return courseDao.selectCourseById(id);
    }

    @Override
    public Integer addOneCourse(Course course) {
       CourseDaoImpl courseDao = new CourseDaoImpl();
       return  courseDao.insertCourse(course);
    }

    @Override
    public Integer setOneCourse(Course course) {
       CourseDaoImpl courseDao = new CourseDaoImpl();
       return courseDao.updateCourse(course);
    }

    @Override
    public Integer delCourseById(Integer id) {
        CourseDaoImpl courseDao = new CourseDaoImpl();
        return courseDao.deleteCourse(id);
    }
}
