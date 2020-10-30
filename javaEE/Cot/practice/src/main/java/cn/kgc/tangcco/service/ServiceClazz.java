package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Clazz;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 13:45
 */
public interface ServiceClazz {
    /**
     * 调用底层Dao selectAllClazzs方法
     *
     * @return 返回教室集合
     */
    public List<Clazz> getClazzList();

    /**
     *  调用底层Dao insertOneClazz方法
     * @param clazz 教室信息
     * @return 返回小于等于0 存储失败 大于0为 存储成功
     */
    public Integer addOneClazz(Clazz clazz);

    public Clazz getClazzById(Integer id);

    public Integer setOneClazz(Clazz clazz);

    public Integer delClazzById(Integer id);
}
