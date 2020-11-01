package cn.kgc.tangcco.service;
import cn.kgc.tangcco.dao.impl.ClazzDaoImpl;
import cn.kgc.tangcco.pojo.Clazz;
import cn.kgc.tangcco.pojo.Page;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 13:50
 */
public class ServiceClazzImpl implements ServiceClazz {
    @Override
    public Page getClazzList(Integer page,Integer size) {
        ClazzDaoImpl daoImpl =new ClazzDaoImpl();
     if(page != null && size!=null){
          //给根据客户端的请求的页码 和 一页共显示总数
          int initial = (page - 1) * size;
          //调用dao方法获取表单里数据的总数
          Integer rowCount = daoImpl.selectClazzCount();
          //根据数据库表单总数获取 页数总数
          int pageCount = (rowCount % size) != 0 ? rowCount / (size + 1) : rowCount / size;
          //把存有 clazz信息的集合 ,clazz表单总数,一页行的总数,页总数,页码 存到 Page 对象里
          Page pagePage = new Page (rowCount,size,pageCount,page);
          pagePage.setClazzList(daoImpl.selectAllClazzs(initial,size));
          return pagePage;
      }else {
         Page pagePage= new Page();
         pagePage.setClazzList(daoImpl.selectAllClazzs(page, size));
         return pagePage;
     }
    }
    @Override
    public Integer addOneClazz(Clazz clazz) {
        return new ClazzDaoImpl().insertOneClazz(clazz);
    }
    @Override
    public Clazz getClazzById(Integer id) {
        return new ClazzDaoImpl().selectClazzById(id);
    }
    @Override
    public Integer setOneClazz(Clazz clazz) {
        return new ClazzDaoImpl().updateOneClazz(clazz);
    }
    @Override
    public Integer delClazzById(Integer id) {
        return  new ClazzDaoImpl().deleteClazzById(id);
    }
}
