package cn.kgc;

import cn.kgc.pojo.Product;
import cn.kgc.service.ProductServiceImpl;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test01(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        ProductServiceImpl productServiceImpl = context.getBean("productServiceImpl", ProductServiceImpl.class);
        productServiceImpl.getProducts().forEach(product -> System.out.println(JSON.toJSONString(product)));
    }
    @Test
    public void test02(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        ProductServiceImpl productServiceImpl = context.getBean("productServiceImpl", ProductServiceImpl.class);
        Product productById = productServiceImpl.getProductById(1);
        System.out.println(JSON.toJSONString(productById));
    }
}
