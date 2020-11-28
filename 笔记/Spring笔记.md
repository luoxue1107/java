# Spring



```
resources文件夹创建xml类型的Srping配置文件
在<beans>标签里写<bean>标签
```

## 属性注入:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 导入property的命名空间                  xmlns:p="http://www.springframework.org/schema/p" 
                                                   导入constructor-arg的命名空间                    xmlns:c="http://www.springframework.org/schema/c"
  
约束文件       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
 ">
  <!--调用无参构造函数新建一个对象，然后调用对应属性的set方法为对象赋值。
        bean:对象的定义，id:对象id，class:对应的类
        property:对象属性，name:属性名称，value:属性值，字符串型-->
    
<bean id="object"class="cn.kgc.Clazz">
    <property name="id" value="1" />
    <property name="name" value="name"/>
</bean>
 
  <!--property 简便写法 需要导入对应的命名空间
 对象引用使用p:属性名-ref-->
 <bean id="object" class="cn.kgc.Clazz"
     p:id="1"  p:name="name" p:Clazz-ref="object"/>
  <!-- constructor-arg简便写法 需要导入对应的命名空间-->
 <bean id="object" class="cn.kgc.Clazz" c:id="2" c:name="name">
</beans>
```

### 引入命名空间和约束文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">

    <!--引入资源文件，首先必须引入头部的context命名空间和约束文件-->
   <context:property-placeholder location="文文件名称.properties"/>

</beans>
```

### ref:

```xml
<baen id="object" class="cn.kgc.Clazz">
<!--引用已存在的对象-->
    <propenty name="clazz2" ref="Clazz2"/>
</baen>
```

###   构造函数注入:

```xml
<bean id="object" class="cn.kgc.Clazz">
<!--调用对应的有参构造函数新建对象
 constructor-arg：构造函数参数-->   
<constructor-arg name="id" value="3"/>
<constructot-arg name="name" value="name"/>   
</bean>
```

### 对象赋空值:

```xml
<bean id="object" class="cn.kgc.Clazz">
    <propenty name="clazz2" ref="Clazz2"/>
    <propenty name="clazz3">
        <!--值为空-->
        <null/>
    </propenty>
</bean>
```

### set集合的存值:

```xml
<bean id="object" class="cn.kgc.Clazz">
    <propenty name="set1">
        <set>
            <vlaue>set值</vlaue>
            <vlaue>set值</vlaue>
        	<vlaue>set值</vlaue>
        </set>
    </propenty>
</bean>
```

### list集合的存值:

```xml
<bean id="object" class="cn.kgc.Clazz">  
<property name="list1">
            <list>
                <value>list值</value>
                <value>list值</value>
                <value>list值</value>
            </list>
        </property>
</bean>
```

### map集合的存值:

```xml
<bean id="object" class="cn.kgc.Clazz"> 
<property name="results">
	<map>
     <entry key="值1" value="map值"/>
     <entry key="值2" value="map值"/>
     <entry key="值3" value="map值"/>
 	</map>
  </property>
</bean>
```

### 对象集合的存入:

```xml
<bean id="object" class="cn.kgc.Clazz"> 
  <property name="clazzlist">
            <list>
                <ref bean="clazz1"/>
                <ref bean="clazz2"/>
            </list>
   </property>
</bean>
```

## 对象的获取:

```java
//读取类路径下的配置文件beans.xml
ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

//从应用程序环境中获取id为clazz的对象
Clazz clazz = (Clazz)ctx.getBean("clazz1");

//获取对象之后进行转型 默认类型时object
Student s1 = (Student) ctx.getBean("student1");
//获取对象的时直接转型
Student s2 = ctx.getBean("student1", Student.class);

/*根据类型推断对象定义，此类对象在配置文件中只能有一个*/
Student s3 = ctx.getBean(Student.class);
```

## .properties文件

```properties
格式:
名称=值

clazz.id = 1
clazz.name=name


clazz2.id=2
clazz2.name=name
```

## autowire:自动装配:

```xml
<!--
byName:通过名称自动装配，属性名称必须与对象的id名一致
byType:通过类型自动装配，此类型的对象在配置文件中只能有一个
-->
<bean id="student1" class="cn.kgc.pojo.Student" autowire="byName">
<property name="sid"value="${student.sid}"/>
<property name="name" value="${student.name}"/>
<property name="sex" value="${student.sex}"/>
<property name="age" value="${student.age}"/>
<!--
<property name="clazz" ref="clazz"/>
-->
</bean>
```

### component-scan组件扫描:

```xml
<!--不要忘记添加 context名称空间和约束 xmlns:context="http://www.springframework.org/schema/context"

 xsi:schemaLocation添加约束
http://www.springframework.org/schema/context      http://www.springframework.org/schema/context/spring-context.xsd"
      
component-scan:组件扫描，扫描base-package包下面的所有的注解，自动注册对象-->
    <context:component-scan base-package="cn.kgc"/>
```



## 注解:

### @Repositor 持久层注解与@Autowired自动装配注解(根据类型装配)

```java
//repository：持久层注解，将此对象注册为一个数据库输入输出的组件
//注册名称为类名，首字母小写
@Repository
public class StudentDaoImpl implements StudentDao {
    //根据类型自动装配，等于autowire="byType"
    @Autowired
    private Clazz clazz;

    @Override
    public List<Student> selectAllStudents() {
        return clazz.getStudents();
    }
}

```

### @Service 业务层注解

```java
//service:业务层注解，将它注册为一个业务组件
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }
}

```

###  @Qualifier 按名称装配对象

```java
@Service
public class UserServiceImpl implements UserService {
    //Qualifier:使用某个名称的类型装配
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }
}

```

ssm 

spring springmvc  mybatis

ssh

spring struts2 hibernate(JPA)

springmvc 封装servlet  替代原servlet