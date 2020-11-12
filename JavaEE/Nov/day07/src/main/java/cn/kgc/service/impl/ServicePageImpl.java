package cn.kgc.service.impl;

import cn.kgc.dao.impl.EmployeeDaoImpl;
import cn.kgc.dao.impl.PageDaoImpl;
import cn.kgc.pojo.Page;
import cn.kgc.service.ServicePage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 12:17
 */
public class ServicePageImpl  implements ServicePage {
    @Override
    public Page getPage(Integer page, Integer size) {
        ServiceEmpAndRolImpl er= new ServiceEmpAndRolImpl();
        Page pages=null;
        if (page == null) {
            System.out.println("service层page为空");
            return null;
        }else if (size==null){
            System.out.println("service层size为空");
            return null;
        }else {
            PageDaoImpl pageDao= new PageDaoImpl();
            EmployeeDaoImpl employeeDaoImpl= new EmployeeDaoImpl();
            //给根据客户端的请求的页码 和 一页共显示总数
            int initial = (page - 1) * size;
            //调用dao方法获取表单里数据的总数
            Integer rowCount = pageDao.selectTotalPage();
            //根据数据库表单总数获取 页数总数
            int pageCount = (rowCount % size) != 0 ? rowCount / size + 1 : rowCount / size;
            //把存有 学生信息的集合 ,学生表单总数,一页行的总数,页总数,页码 存到 Page 对象里
           pages = new Page(employeeDaoImpl.selectAllEmployee(initial, size), rowCount, size, pageCount, page);
        }

        pages.getEmployeeList().forEach(employee -> {
            List<String> strings= new ArrayList<>();
            er.getRoleByEid(employee.getId()).forEach(role -> {
                strings.add(role.getName());
            });
            employee.setRnames(strings);
        });
       pages.getEmployeeList().forEach(employee -> {
            employee.getRnames().forEach(role -> System.out.println(role));
        });
        return pages;

    }
}
