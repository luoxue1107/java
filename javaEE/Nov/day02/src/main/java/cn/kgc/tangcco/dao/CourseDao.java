package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Course;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 19:47
 */
public interface CourseDao {
    /**
     * 查看所有数据
     * @return
     */
    List<Course> selectAllCourse();

    /**
     * 按id查找
     * @return 返回对应数据
     * @param id 数据编号
     */
    Course selectCourseById(Integer id);

    /**
     * 添加一条数据
     * @return 返回整数为成功 负数和零为失败
     * @param course course对象存的数据存到数据库
     */
    Integer insertCourse(Course course);

    /**
     *按id更改数据
     * @return 返回整数为成功 负数和零为失败
     * @param course 更换的数据
     */
    Integer updateCourse(Course course);

    /**
     * 移除一条数据
     * @return 返回整数为成功 负数和零为失败
     * @param id 数据编号
     */
    Integer deleteCourse(Integer id);
}
