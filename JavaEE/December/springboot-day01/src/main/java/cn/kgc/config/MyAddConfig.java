package cn.kgc.config;

import cn.kgc.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李庆华
 * @Description
 * @date 2020/12/2 15:36
 */
@Configuration //配置类
public class MyAddConfig {

    @Bean//将方法返回值 配置到容器中 方法名 就是 配置组件的默认id @Bean注解与 xml配置文件 中的 <bean></bean> 同理
    public PersonService personService(){
        return new PersonService();
    }

}
