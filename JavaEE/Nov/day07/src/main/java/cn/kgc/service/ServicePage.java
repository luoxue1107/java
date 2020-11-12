package cn.kgc.service;

import cn.kgc.pojo.*;
/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 12:14
 */
public interface ServicePage {
     Page getPage(Integer page, Integer size);
}
