package cn.kgc.service;

import cn.kgc.pojo.Page;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 16:37
 */
public interface PageService {
    Page getPage(Map<String, Object> map);
}
