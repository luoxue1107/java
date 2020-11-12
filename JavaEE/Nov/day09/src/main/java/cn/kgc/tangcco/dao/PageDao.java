package cn.kgc.tangcco.dao;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 11:52
 */
public interface PageDao {
    Integer selectTotalPage(Map<String, Object> map);
}
