package cn.kgc.dao;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 15:40
 */
public interface PageDao {
    Integer selectCount(Map<String, Object> map);
}
