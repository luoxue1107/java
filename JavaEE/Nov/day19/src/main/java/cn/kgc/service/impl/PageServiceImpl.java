package cn.kgc.service.impl;

import cn.kgc.dao.impl.DoctorDaoImpl;
import cn.kgc.dao.impl.PageDaoImpl;
import cn.kgc.pojo.Page;
import cn.kgc.service.PageService;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 16:37
 */
public class PageServiceImpl implements PageService {
    @Override
    public Page getPage(Map<String, Object> map) {
        String page1 = (String) map.get("page");
        System.out.println(page1);
        Integer page =Integer.valueOf(page1);
        Integer size =(Integer) map.get("size");

        PageDaoImpl pageDao = new PageDaoImpl();
        DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
        //给根据客户端的请求的页码 和 一页共显示总数
        map.put("initial", (page - 1) * size);
        //调用dao方法获取表单里数据的总数
        Integer rowCount = pageDao.selectCount(map);
        System.out.println(rowCount);
        //根据数据库表单总数获取 页数总数
        Integer pageCount = (rowCount % size) != 0 ? rowCount / size + 1 : rowCount / size;
        //把存有 学生信息的集合 ,学生表单总数,一页行的总数,页总数,页码 存到 Page 对象里
        return new Page(doctorDaoImpl.selectDoctor(map), rowCount, size, pageCount, page);

    }
}
