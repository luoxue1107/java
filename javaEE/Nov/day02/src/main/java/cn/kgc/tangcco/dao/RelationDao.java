package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Course;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 21:38
 */
public interface RelationDao {
    /**
     * @param sid
     * @param cids
     * @return
     */
    int[] insertStdCourses(Integer sid, Integer[] cids);

    /**
     * 以学生编号 查看对应课程
     * @param sid 编号
     * @return 返回学生编号与对应的课程集合
     */
    List<Integer> selectCidsBySid(Integer sid);
    /**
     * 以学生编号 移除课程信息
     * @param sid 学生编号
     * @return 返回整数为成功 零或负数为失败
     */
    Integer deleteCoursesBySid(Integer sid);
    /**
     *
     * @param sid
     * @return
     */
    List<Course> selectCoursesBySid(Integer sid);
}
