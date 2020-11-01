package cn.kgc.tangcco.service;
import cn.kgc.tangcco.dao.impl.StudentDaoImpl;
import cn.kgc.tangcco.pojo.Page;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 16:17
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public Page getStudentList(Integer page, Integer size){
       if (page == null) {
           System.out.println("service层page为空");
           return null;
       }else if (size==null){
           System.out.println("service层size为空");
           return null;
       }else {
           StudentDaoImpl daoImpl= new StudentDaoImpl();
           //给根据客户端的请求的页码 和 一页共显示总数
           int initial = (page - 1) * size;
           //调用dao方法获取表单里数据的总数
           Integer rowCount = daoImpl.selectStudentsCount();
           //根据数据库表单总数获取 页数总数
           int pageCount = (rowCount % size) != 0 ? rowCount / (size + 1) : rowCount / size;
           //把存有 学生信息的集合 ,学生表单总数,一页行的总数,页总数,页码 存到 Page 对象里
           return new Page(daoImpl.selectStudents(initial, size), rowCount,size,pageCount,page);
       }
    }
}
