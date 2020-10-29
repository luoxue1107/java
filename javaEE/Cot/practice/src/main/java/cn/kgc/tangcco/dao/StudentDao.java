package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Student;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 10:56
 */
public interface StudentDao {
    /**
     * 向数据 取出数据
     * @param initial 初始
     * @param length 长度
     * @return  学生集合
     */
    public List<Student>  selectStudents(Integer initial,Integer length);

    /**
     * 获取学生表单总数
     * @return 返回学生表单总数值
     */
    public Integer  selectStudentsCount();

}
