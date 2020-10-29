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
     * 调用底层Dao 方法
     * @return 返回教室集合
     */
    public List<Clazz> getClazzList();
}
