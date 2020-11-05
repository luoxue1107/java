package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Student;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:41
 */
public interface ServiceStudent {
    /**
     * 获取所有 student 数据
     * @return
     */
    List<Student> getAllStudent();
}
