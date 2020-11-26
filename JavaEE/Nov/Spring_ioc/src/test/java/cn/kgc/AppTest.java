package cn.kgc;

import cn.kgc.dao.StudentDaoImpl;
import cn.kgc.pojo.Clazz;
import cn.kgc.pojo.Student;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student01 = context.getBean("student01", Student.class);
        System.out.println(JSON.toJSONString(student01));
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student02 = context.getBean("student02", Student.class);
        Student student03 = context.getBean("student03", Student.class);
        Student student04 = context.getBean("student04", Student.class);
        System.out.println(JSON.toJSONString(student02) + "\n" + JSON.toJSONString(student03) + "\n" + JSON.toJSONString(student04));
    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Clazz clazz05 = context.getBean("clazz05", Clazz.class);
        Student student05 = context.getBean("student05", Student.class);
        System.out.println(JSON.toJSONString(clazz05)+"\n"+JSON.toJSONString(student05));
    }
    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Clazz clazz = context.getBean("clazz", Clazz.class);
        System.out.println(JSON.toJSONString(clazz));
    }
    @Test
    public void test05(){
        StudentDaoImpl studentDao= new StudentDaoImpl();
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);
        studentDao.getStudent();
    }

}


