package cn.kgc.tangcco.service.Impl;

import cn.kgc.tangcco.dao.Impl.JournalismDaoImpl;
import cn.kgc.tangcco.dao.Impl.PageDaoImpl;
import cn.kgc.tangcco.pojo.*;
import cn.kgc.tangcco.service.ServicePage;

import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 12:17
 */
public class ServicePageImpl implements ServicePage {
    @Override
    public Page getPage(Map<String, Object> map) {

        Integer page = (Integer) map.get("page");
        Integer size = (Integer) map.get("size");

        Page pages=null;
        if (page == null) {
            System.out.println("service层page为空");
        }else if (size==null){
            System.out.println("service层size为空");
        }else {
            PageDaoImpl pageDao= new PageDaoImpl();
            JournalismDaoImpl journalismDaoImpl= new JournalismDaoImpl();
            //给根据客户端的请求的页码 和 一页共显示总数
            map.put("initial",(page - 1) * size);
            //调用dao方法获取表单里数据的总数
            Integer rowCount = pageDao.selectTotalPage(map);
            //根据数据库表单总数获取 页数总数
            int pageCount = (rowCount % size) != 0 ? rowCount / size + 1 : rowCount / size;
            //把存有 学生信息的集合 ,学生表单总数,一页行的总数,页总数,页码 存到 Page 对象里
           pages = new Page(journalismDaoImpl.selectAllJournalism(map), rowCount, size, pageCount, page);
        }
        return pages;
    }
}
