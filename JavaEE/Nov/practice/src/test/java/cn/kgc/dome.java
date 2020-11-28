package cn.kgc;
import cn.kgc.dao.StudentDaoImpl;
import cn.kgc.pojo.Clazz;
import cn.kgc.service.StudentServiceImpl;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 18:46
 */
public class dome {

    @Test
    public  void  test01(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

//        用标签自动装配的对象 对象名头字母一定要小写
        StudentDaoImpl studentDao = context.getBean("studentDaoImpl", StudentDaoImpl.class);
        List<Clazz> clazzList = studentDao.getClazzList();
        for (Clazz clazz : clazzList) {
            System.out.println(JSON.toJSONString(clazz));
        }
    }
    @Test
    public void test02(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        StudentServiceImpl studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);

        List<Clazz> clazzList = studentService.getClazzList();
        clazzList.forEach(clazz-> System.out.println(JSON.toJSONString(clazz)));


    }

}
