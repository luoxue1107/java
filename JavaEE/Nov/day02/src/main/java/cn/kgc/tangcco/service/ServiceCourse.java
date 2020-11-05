package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Course;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:38
 */
public interface ServiceCourse {
    /**
     * 获取全部Course数据
     * @return 返回course集合
     */
    List<Course> getAllCourses();
    /**
     * 以编号获取course数据
     * @param id 编号
     * @return 返回course对象
     */
    Course getCourseById(Integer id);
    /**
     * 添加course一条数据
     * @param course course对象
     * @return 返回整数为成功 零或负数为失败
     */
    Integer addOneCourse(Course course);
    /**
     * 设置指定编号 course数据
     * @param course course对象
     * @return
     */
    Integer setOneCourse(Course course);
    /**
     * 清除指定编号 数据
     * @param id 编号
     * @return 返回整数为成功 零或负数为失败
     */
    Integer delCourseById(Integer id);
}
