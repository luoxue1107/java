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
     * @return 返回一个教室对象集合
     */
      List<Clazz> selectAllClazzs();
}
