package cn.kgc.tangcco.service;

import cn.kgc.tangcco.pojo.Page;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 12:14
 */
public interface ServicePage {
     Page getPage(Map<String, Object> map);
}
