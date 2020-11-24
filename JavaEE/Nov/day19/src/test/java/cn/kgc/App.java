package cn.kgc;

import cn.kgc.pojo.Department;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/19 12:18
 */
public class App {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Department department = (Department)context.getBean("department");
        Department department2 = context.getBean("department2", Department.class);
        System.out.println(JSON.toJSONString(department));
        System.out.println(JSON.toJSONString(department2));
    }
}
