package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Course;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:40
 */
public interface ServiceRelation {
    /**
     * 添加course与student 关联表信息
     *
     * @param sid  student编号
     * @param cids course编号数组
     * @return
     */
    Integer addRelation(Integer sid, Integer[] cids);

    /**
     * 以student编号 获取course集合 信息
     *
     * @param sid student编号
     * @return 返回课程编号
     */
    List<Integer> getCidsBySid(Integer sid);

    /**
     * 以student编号 删除relation关联的信息
     *
     * @param sid student编号
     * @return 返回整数为成功 零或负数为失败
     */
    Integer delRelationBySid(Integer sid);

    /**
     * 以学生编号 查看课程
     * @param sid 学生编号
     * @return 返回课程集合
     */
    List<Course> selectCoursesBySid(Integer sid);
}
