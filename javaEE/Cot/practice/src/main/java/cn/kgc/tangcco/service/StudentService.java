package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Page;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 16:13
 */
public interface StudentService {
    /**
     * 查看学生集合
     * @param page 页数
     * @param size 总数
     * @return 学生对象集合
     */
    public Page getStudentList(Integer page, Integer size);
}
