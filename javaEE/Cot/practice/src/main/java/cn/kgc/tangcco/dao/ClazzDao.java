package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Clazz;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 12:14
 */
public interface ClazzDao {
    /**
     * 导入数据库教室表
     *
     * @return 返回一个教室对象集合
     */
    List<Clazz> selectAllClazzs();

    /**
     *  教室信息存到数据库
     * @param clazz 教室信息
     * @return 返回小于等于0 存储失败 大于0为存储成功
     */
    Integer insertOneClazz(Clazz clazz);

    Clazz selectClazzById(Integer id);

    Integer updateOneClazz(Clazz clazz);

    Integer deleteClazzById(Integer id);
}
