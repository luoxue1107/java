# spring注解

## @Configuration注解

该类等价 与XML中配置beans，相当于Ioc容器，它的某个方法头上如果注册了@Bean，就会作为这个Spring容器中的Bean，与xml中配置的bean意思一样。

@Configuration注解的类必需使用<context:component-scanbase-package=”XXX”/>扫描.如下：

```java
@Configuration
public class MainConfig {

    //在properties文件里配置
    @Value("${wx_appid}")
    public String appid;

    protected MainConfig(){}

    @Bean
    public WxMpService wxMpService() {
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }
}
```

定义一个MainConfig，用@Configuration注解，那MainConfig相当于xml里的beans,里面用@Bean注解的和xml里定义的bean等价，用<context:component-scanbase-package=”XXX”/>扫描该类，最终我们可以在程序里用@AutoWired或@Resource注解取得用@Bean注解的bean，和用xml先配置bean然后在程序里自动注入一样。目的是减少xml里配置。



## @Value注解

为了简化从properties里取配置，可以使用@Value, 可以properties文件中的配置值。

在dispatcher-servlet.xml里引入properties文件。

1. <context:property-placeholder** location=“classpath:test.properties” /> 

```java
<context:property-placeholder location="classpath:test.properties" />
```

在程序里使用@Value:

@Value(“${wx_appid}”)

**public**String appid;

即使给变量赋了初值也会以配置文件的值为准。





## @Controller, @Service, @Repository,@Component

目前4种注解意思是一样，并没有什么区别，区别只是名字不同。使用方法：



1.使用<context:component-scanbase-package=”XXX”/>扫描被注解的类

在类上写注解：

@Controller

**public class** TestController {

 

}

 



##  @PostConstruct 和 @PreDestory 



实现初始化和销毁bean之前进行的操作，只能有一个方法可以用此注释进行注释，方法不能有参数，返回值必需是void,方法需要是非静态的。

例如：



```java
public class TestService { 

    @PostConstruct  
    public void  init(){  
        System.out.println("初始化");  
    }  

    @PreDestroy  
    public void  dostory(){  
        System.out.println("销毁");  
    }  
}
```



@PostConstruct：在构造方法和init方法（如果有的话）之间得到调用，且只会执行一次。

@PreDestory：注解的方法在destory()方法调用后得到执行。

网上拷贝的流程图：

![img](./img/Center.png)





引深一点，Spring 容器中的 Bean 是有生命周期的，Spring 允许在 Bean 在初始化完成后以及 Bean 销毁前执行特定的操作，常用的设定方式有以下三种：

1.通过实现 InitializingBean/DisposableBean 接口来定制初始化之后/销毁之前的操作方法；

2.通过 <bean> 元素的 init-method/destroy-method属性指定初始化之后 /销毁之前调用的操作方法；

3.在指定方法上加上@PostConstruct 或@PreDestroy注解来制定该方法是在初始化之后还是销毁之前调用

但他们之前并不等价。即使3个方法都用上了，也有先后顺序.

**Constructor > @PostConstruct >InitializingBean > init-method**

 



## @Primary

自动装配时当出现多个Bean候选者时，被注解为@Primary的Bean将作为首选者，否则将抛出异常。

例如：

```java
@Component  
public class Apple implements Fruit{  

    @Override  
    public String hello() {  
        return "我是苹果";  
    }  
}

@Component  
@Primary
public class Pear implements Fruit{  

    @Override  
    public String hello(String lyrics) {  
        return "梨子";  
    }  
}

public class FruitService { 

  //Fruit有2个实例子类，因为梨子用@Primary，那么会使用Pear注入
    @Autowired  
    private Fruit fruit;  

    public String hello(){  
        return fruit.hello();  
    }  
}
```





##  @Lazy(true)

  用于指定该Bean是否取消预初始化，用于注解类，延迟初始化。



##  @Autowired

Autowired默认先按byType，如果发现找到多个bean，则，又按照byName方式比对，如果还有多个，则报出异常。

1.可以手动指定按byName方式注入，使用@Qualifier。

//通过此注解完成从spring配置文件中 查找满足Fruit的bean,然后按//@Qualifier指定pean

@Autowired

@Qualifier(“pean”)

public Fruit fruit;

2.如果要允许null 值，可以设置它的required属性为false，如：@Autowired(required=false) 

public Fruit fruit;

## @Resource

默认按 byName自动注入,如果找不到再按byType找bean,如果还是找不到则抛异常，无论按byName还是byType如果找到多个，则抛异常。

可以手动指定bean,它有2个属性分别是name和type，使用name属性，则使用byName的自动注入，而使用type属性时则使用byType自动注入。

@Resource(name=”bean名字”)

或

@Resource(type=”bean的class”)

这个注解是属于J2EE的，减少了与spring的耦合。

 

##  @Async

  java里使用线程用3种方法：

1. 继承Thread，重写run方法

2. 实现Runnable,重写run方法

3. 使用Callable和Future接口创建线程，并能得到返回值。

前2种简单，第3种方式特别提示一下，例子如下：

```java
class MyCallable implements Callable<Integer> {
    private int i = 0;
    // 与run()方法不同的是，call()方法具有返回值
    @Override
    public Integer call() {
        int sum = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }
}
```

main方法：

```java
public static void main(String[] args) {
        Callable<Integer> myCallable = new MyCallable();    // 创建MyCallable对象
        FutureTask<Integer> ft = new FutureTask<Integer>(myCallable); //使用FutureTask来包装MyCallable对象
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread thread = new Thread(ft);   //FutureTask对象作为Thread对象的target创建新的线程
                thread.start();                      //线程进入到就绪状态
            }
        }
        System.out.println("主线程for循环执行完毕..");
        try {
            int sum = ft.get();            //取得新创建的新线程中的call()方法返回的结果
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
}
```



而使用@Async可视为第4种方法。基于@Async标注的方法，称之为异步方法,这个注解用于标注某个方法或某个类里面的所有方法都是需要异步处理的。被注解的方法被调用的时候，会在新线程中执行，而调用它的方法会在原来的线程中执行。

application.xml形势的配置：

第一步配置XML。

```xml
<!--扫描注解，其中包括@Async -->
<context:component-scan base-package="com.test"/>
<!-- 支持异步方法执行, 指定一个缺省的executor给@Async使用-->
<task:annotation-driven executor="defaultAsyncExecutor"  /> 
<!—配置一个线程执行器-->
<task:executor id=" defaultAsyncExecutor "pool-size="100-10000" queue-capacity="10" keep-alive =”5”/>
```

参数解读：

<task:executor />配置参数：

id：当配置多个executor时，被@Async(“id”)指定使用；也被作为线程名的前缀。

pool-size：

core size：最小的线程数，缺省：1

max size：最大的线程数，缺省：Integer.MAX_VALUE

queue-capacity：当最小的线程数已经被占用满后，新的任务会被放进queue里面，当这个queue的capacity也被占满之后，pool里面会创建新线程处理这个任务，直到总线程数达到了max size，这时系统会拒绝这个任务并抛出TaskRejectedException异常（缺省配置的情况下，可以通过rejection-policy来决定如何处理这种情况）。缺省值为：Integer.MAX_VALUE

keep-alive：超过core size的那些线程，任务完成后，再经过这个时长（秒）会被结束掉

rejection-policy：当pool已经达到max size的时候，如何处理新任务

ABORT（缺省）：抛出TaskRejectedException异常，然后不执行DISCARD：不执行，也不抛出异常

DISCARD_OLDEST：丢弃queue中最旧的那个任务

CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行



第二步在类或方法上添加@Async，当调用该方法时，则该方法即是用异常执行的方法单独开个新线程执行。

```java
@Async(“可以指定执行器id，也可以不指定”)
    public static void testAsyncVoid (){
        try {
            //让程序暂停100秒，相当于执行一个很耗时的任务
    System.out.println(“异常执行打印字符串”);
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```



当在外部调用testAsync方法时即在新线程中执行，由上面<task: annotation-driven/>执行器去维护线程。

总结：先用context:component-scan去扫描注解，让spring能识别到@Async注解，然后task:annotation-driven去驱动@Async注解，并可以指定默认的线程执行器executor。那么当用@Async注解的方法或类得到调用时，线程执行器会创建新的线程去执行。

 

上面方法是无返回值的情况，还有异常方法有返回值的例子。

```java
@Async
public Future<String> testAsyncReturn () {  
    System.out.println("Execute method asynchronously - "  
      + Thread.currentThread().getName());  
    try {  
        Thread.sleep(5000);  
        return new AsyncResult<String>("hello world !!!!");  
    } catch (InterruptedException e) {  
        //  
    }  
    return null;  
}
```



返回的数据类型为Future类型，接口实现类是AsyncResult.

调用方法如下：

```java
public void test(){
    Future<String> future = cc.testAsyncReturn();  
    while (true) {  ///这里使用了循环判断，等待获取结果信息  
        if (future.isDone()) {  //判断是否执行完毕  
            System.out.println("Result from asynchronous process - " + future.get());  
            break;  
        }  
        System.out.println("Continue doing something else. ");  
        Thread.sleep(1000);  
    }  
}
```



通过不停的检查Future的状态来获取当前的异步方法是否执行完毕

[参考文章](http://blog.csdn.net/clementad/article/details/47403185)







编程的方式使用@Async:

```java
@Configuration  
@EnableAsync  
public class SpringConfig {  

    private int corePoolSize = 10;  
    private int maxPoolSize = 200; 
    private int queueCapacity = 10;  
    private String ThreadNamePrefix = "MyLogExecutor-";  

    @Bean  
    public Executor logExecutor() {  
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();  
        executor.setCorePoolSize(corePoolSize);  
        executor.setMaxPoolSize(maxPoolSize);  
        executor.setQueueCapacity(queueCapacity);  
        executor.setThreadNamePrefix(ThreadNamePrefix);  
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务  
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行  
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());  
        executor.initialize();  
        return executor;  
    }
}
```





## @Named

@Named和Spring的@Component功能相同。@Named可以有值，如果没有值生成的Bean名称默认和类名相同。比如

@Named public class Person 

或

@Named(“cc”) public class Person

 



##  @Inject

使用@Inject需要引用javax.inject.jar，它与Spring没有关系，是jsr330规范。

与@Autowired有互换性。

 



## @Singleton

只要在类上加上这个注解，就可以实现一个单例类，不需要自己手动编写单例实现类。

 



## @Valid,@Valided

@Valid

  网上一大片使用@Valid失效不能用的情况。为什么呢？

1.@Valid必需使用在以@RequestBody接收参数的情况下。

2.使用ajax以POST方式提示数据，禁止用Fiddler以及浏览器直接访问的方式测试接口

3.用<mvc:annotation-driven />添加注解驱动。

4.@Valid是应用在javabean上的校验。

5.

```xml
<dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>4.2.0.Final</version>
        </dependency> 
<dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>org.codehaus.jackson</groupId>
            <artifactId>jackson-mapper-asl</artifactId>
            <version>1.9.8</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.module</groupId>
            <artifactId>jackson-module-jaxb-annotations</artifactId>
            <version>2.5.3</version>
```



这些jar包是需要的。@Valid是使用[hibernate](http://lib.csdn.net/base/javaee) validation的时候使用，可参数下面介绍的@RequestBody

6.@Valid下后面紧跟BindingResult result，验证结果保存在result

 

例如：

```java
@RequestMapping("/test")
    public String testValid(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for(ObjectError error : errorList){
                System.out.println(error.getDefaultMessage());
            }
        }  
        return "test";
}
```



在入参User上添加了@Valid做校验，在User类里属性上实行实际的特定校验。

例如在User的name属性上加

@NotBlank

private String name;

 

全部参数校验如下：

空检查

@Null    验证对象是否为null

@NotNull  验证对象是否不为null, 无法查检长度为0的字符串

@NotBlank 检查约束字符串是不是Null还有被Trim的长度是否大于0,只对字符串,且会去掉前后空格.

@NotEmpty 检查约束元素是否为NULL或者是EMPTY.

 

Booelan检查

@AssertTrue   验证 Boolean 对象是否为 true 

@AssertFalse  验证 Boolean 对象是否为 false 

 

长度检查

@Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内 

@Length(min=, max=)验证注解的元素值长度在min和max区间内

日期检查

@Past      验证 Date 和 Calendar 对象是否在当前时间之前 

@Future   验证 Date 和 Calendar 对象是否在当前时间之后 

@Pattern  验证 String 对象是否符合正则表达式的规则

 

数值检查，建议使用在Stirng,Integer类型，不建议使用在int类型上，因为表单值为“”时无法转换为int，但可以转换为Stirng为”“,Integer为null

@Min(value=””)      验证 Number 和 String 对象是否大等于指定的值 

@Max(value=””)       验证 Number 和 String 对象是否小等于指定的值 

@DecimalMax(value=值) 被标注的值必须不大于约束中指定的最大值. 这个约束的参数是一个通过BigDecimal定义的最大值的字符串表示.小数存在精度

@DecimalMin(value=值) 被标注的值必须不小于约束中指定的最小值. 这个约束的参数是一个通过BigDecimal定义的最小值的字符串表示.小数存在精度

@Digits   验证 Number 和 String 的构成是否合法 

@Digits(integer=,fraction=)验证字符串是否是符合指定格式的数字，interger指定整数精度，fraction指定小数精度。

 

@Range(min=, max=) 检查数字是否介于min和max之间.

@Range(min=10000,max=50000,message=”range.bean.wage”)

private BigDecimal wage;

 

@Valid 递归的对关联对象进行校验, 如果关联对象是个集合或者数组,那么对其中的元素进行递归校验,如果是一个map,则对其中的值部分进行校验.(是否进行递归验证)

@CreditCardNumber信用卡验证

@Email 验证是否是邮件地址，如果为null,不进行验证，算通过验证。

@ScriptAssert(lang=,script=, alias=)

@URL(protocol=,host=,port=,regexp=, flags=)

 

@Validated

@Valid是对javabean的校验，如果想对使用@RequestParam方式接收参数方式校验使用@Validated

使用@Validated的步骤：

第一步：定义全局异常，让该全局异常处理器能处理所以验证失败的情况，并返回给前台失败提示数据。如下，该类不用在任何xml里配置。

```java
import javax.validation.ValidationException;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Component
public class GlobalExceptionHandler {
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handle(ValidationException exception) {
        System.out.println("bad request, " + exception.getMessage());
        return "bad request, " + exception.getMessage();
    }
}
```



第二步。在XXController.java头上添加@Validated，然后在@RequestParam后台使用上面介绍的验证注解，比如@NotBlank,@Rank.

如下：  

```java
@Controller
@RequestMapping("/test")
@Validated
public class TestController extends BaseController {

    @RequestMapping(value = "testValidated", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object testValidated(@RequestParam(value = "pk", required = true) @Size(min = 1, max = 3) String pk,
            @RequestParam(value = "age", required = false) @Range(min = 1, max = 3) String age) {
        try {
            return "pk:" + pk + ",age=" + age;
        } catch (Throwable t) {

            return buildFailure("消息列表查询失败");
        }
    }
} 
```



当入非法参数是，会被全局处理器拦截到，（Spring切面编程方式），如果参数非法即刻给前台返回错误数据。

测试：http://127.0.0.1:8080/TestValidate/test/testValidated?pk=2&age=12

返回：

![img](https://img-blog.csdn.net/20170527232318709?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYWNoZW55dWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)



注意

@Valid是使用[hibernate](http://lib.csdn.net/base/javaee)Validation.jar做校验

@Validated是只用[spring](http://lib.csdn.net/base/javaee)Validator校验机制使用

[gitHub下载地址](https://github.com/chenyuan122912/Spring-mvc-validate-RequestBody)

@Validated与@RequestBody结合使用时，在接口方法里要增加@Valid。例如：

```java
public Object edit(@Valid @RequestBody AddrRo addrRo) {.....}
```





## @RequestBody

@RequestBody（required=true）

:有个默认属性required,默认是true,当body里没内容时抛异常。

application/x-www-form-urlencoded：窗体数据被编码为名称/值对。这是标准的编码格式。这是默认的方式
multipart/form-data：窗体数据被编码为一条消息，页上的每个控件对应消息中的一个部分。二进制数据传输方式，主要用于上传文件

注意：必需使用POST方式提交参数，需要使用ajax方式请求，用Fiddler去模拟post请求不能。

引用jar包：

Spring相关jar包。

以及

```xml
<dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.5.3</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.3</version>
        </dependency>
```



dispatchServlet-mvc.xml配置
第一种，直接配置MappingJackson2HttpMessageCoverter：

```xml
<bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping"></bean>
<bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
    <property name="messageConverters">
        <bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"></bean>
    </property>
</bean>
```

第二种：<mvc:annotation-driven/> 就不用配置上面bean,默认会配好。

  Ajax请求：

```js
function  testRequestBody() {
    var o = {"status":9};
     jQuery.ajax({
            type: "POST",
            url: "http://127.0.0.1:8080/TestValidate/test/testValid",
            xhrFields:{
                withCredentials:true
            },
            data: JSON.stringify(o),
            contentType: "application/json",
            dataType: "json",
            async: false,
            success:function (data) {
                console.log(data);
            },

            error: function(res) {
                 console.log(res);
            }
        });
}
```



后台XXXcontroller.java:

```java
@RequestMapping(value="/ testValid ",method=RequestMethod.POST)
@ResponseBody
public Object setOrderInfo(@RequestBody InfoVO infoVO,HttpServletRequest request, HttpServletResponse response){
        InfoVO cVo = getInfoVo(infoVO);
        return "success";
    }
```

开发时，不是报415，就是400错误，头都大了。还是细节没做到位，注意下面几个要点：

Content-Type必需是application/json

需要jackson-databind.jar

<mvc:annotation-driven/>要配置或直接配置bean

XXXController.jar在post方式接收数据

最最重要的，使用ajax以post方式请求。不能用Fiddler模拟,不然会出错。







## @CrossOrigin

是Cross-Origin ResourceSharing（跨域资源共享）的简写

  作用是解决跨域访问的问题，在Spring4.2以上的版本可直接使用。在类上或方法上添加该注解

例如：

```java
@CrossOrigin
public class TestController extends BaseController {
    XXXX
}
```

如果失效则可能方法没解决是GET还是POST方式，指定即可解决问题。



## @RequestParam

作用是提取和解析请求中的参数。@RequestParam支持类型转换，类型转换目前支持所有的基本Java类型

@RequestParam([value=”number”], [required=false])  String number 

将请求中参数为number映射到方法的number上。required=false表示该参数不是必需的，请求上可带可不带。

 



###  @PathVariable，@RequestHeader，@CookieValue，@RequestParam, @RequestBody，@SessionAttributes, @ModelAttribute;

**@PathVariable：**处理requet uri部分,当使用@RequestMapping URI template 样式映射时， 即someUrl/{paramId}, 这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上

例如：

```java
@Controller 
@RequestMapping("/owners/{a}") 
public class RelativePathUriTemplateController { 
  @RequestMapping("/pets/{b}") 
  public void findPet(@PathVariable("a") String a,@PathVariable String b, Model model) {     
    // implementation omitted 
  } 
}
```



**@RequestHeader，@CookieValue:** 处理request header部分的注解

将头部信息绑定到方法参数上：

```java
@RequestMapping("/test") 
public void displayHeaderInfo(@RequestHeader("Accept-Encoding") String encoding, 
                              @RequestHeader("Keep-Alive")long keepAlive)  { 

  //... 

}
```



//将cookie里JSESSIONID绑定到方法参数上

```java
@RequestMapping("/test")  
public void displayHeaderInfo(@CookieValue("JSESSIONID") String cookie)  {  

  //...  

}
```



### @RequestParam, @RequestBody: 处理request body部分的注解,已经介绍过，不用介绍了。

**@SessionAttributes,@ModelAttribute**：处理attribute类型是注解。XXXX

 



## @Scope

配置bean的作用域。

@Controller

@RequestMapping(“/test”)

@Scope(“prototype”)

public class TestController {

 

 

}

默认是单例模式，即@Scope(“singleton”),

singleton：单例，即容器里只有一个实例对象。

prototype：多对象，每一次请求都会产生一个新的bean实例，Spring不无法对一个prototype bean的整个生命周期负责，容器在初始化、配置、装饰或者是装配完一个prototype实例后，将它交给客户端，由程序员负责销毁该对象，不管何种作用域，容器都会调用所有对象的初始化生命周期回调方法，而对prototype而言，任何配置好的析构生命周期回调方法都将不会被调用

request：对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效

web.xml增加如下配置：

```xml
<listener>
<listener-class>org.springframework.web.context.request.RequestContextListener</listener-class>
  </listener>
session：该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP session内有效。也要在web.xml配置如下代码：
<listener>
<listener-class>org.springframework.web.context.request.RequestContextListener</listener-class>
  </listener>
global session：作用不大，可不用管他。
```







## @ResponseStatus

@ResponseStatus用于修饰一个类或者一个方法，修饰一个类的时候，一般修饰的是一个异常类,当处理器的方法被调用时，@ResponseStatus指定的code和reason会被返回给前端。value属性是http状态码，比如404，500等。reason是错误信息

当修改类或方法时，只要该类得到调用，那么value和reason都会被添加到response里

例如：

```java
@ResponseStatus(value=HttpStatus.FORBIDDEN, reason="出现了错误")
public class UserException extends RuntimeException{

    XXXXX
}
```





当某处抛出UserException时，则会把value和reason返回给前端。

```java
@RequestMapping("/testResponseStatus")
    public String testResponseStatus(int i){
        if(i==0)
            throw new UserNotMatchException();
        return "hello";
}
```



修改方法：

```java
@ControllerAdvice
@Component
public class GlobalExceptionHandler {
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="哈哈")
    public String handle(ValidationException exception) {
        System.out.println("bad request, " + exception.getMessage());
        return "bad request, " + exception.getMessage();
    }
}
```


结果如下：

![img](https://img-blog.csdn.net/20170527232323419?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYWNoZW55dWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)



正如上面所说，该方法得到调用，不论是否抛异常，都会把value和reason添加到response里。

总结：@ResponseStatus是为了在方法或类得到调用时将指定的code和reason添加到response里返前端，就像服务器常给我们报的404错误一样，我们可以自己指定高逼格错误提示。







##  @RestController

@RestController = @Controller + @ResponseBody。

是2个注解的合并效果，即指定了该controller是组件，又指定方法返回的是String或json类型数据，不会解决成jsp页面，注定不够灵活，如果一个Controller即有SpringMVC返回视图的方法，又有返回json数据的方法即使用@RestController太死板。

灵活的作法是：定义controller的时候，直接使用@Controller，如果需要返回json可以直接在方法中添加@ResponseBody

 

 

## @ControllerAdvice

官方解释是：It is typically used todefine@ExceptionHandler,

 @InitBinder, and@ModelAttribute methods that apply to all@RequestMapping methods

意思是：即把@ControllerAdvice注解内部使用@ExceptionHandler、@InitBinder、@ModelAttribute注解的方法应用到所有的 @RequestMapping注解的方法。非常简单，不过只有当使用@ExceptionHandler最有用，另外两个用处不大。

```java
@ControllerAdvice  
public class GlobalExceptionHandler {  
    @ExceptionHandler(SQLException.class)  
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,reason=”sql查询错误”)  
    @ResponseBody  
    public ExceptionResponse handleSQLException(HttpServletRequest request, Exception ex) {  
        String message = ex.getMessage();  
        return ExceptionResponse.create(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);  
    } 
}
```



即表示让Spring捕获到所有抛出的SQLException异常，并交由这个被注解的handleSQLException方法处理，同时使用@ResponseStatus指定了code和reason写到response上，返回给前端。





## 元注解包括 @Retention @Target @Document @Inherited四种

元注解是指注解的注解，比如我们看到的 ControllerAdvice 注解定义如下。

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ControllerAdvice {
    XXX
}
```





@Retention: 定义注解的保留策略：

@Retention(RetentionPolicy.SOURCE)  //注解仅存在于源码中，在class字节码文件中不包含

@Retention(RetentionPolicy.CLASS)   //默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得，

@Retention(RetentionPolicy.RUNTIME) //注解会在class字节码文件中存在，在运行时可以通过反射获取到

 

@Target：定义注解的作用目标:

@Target(ElementType.TYPE)  //接口、类、枚举、注解

@Target(ElementType.FIELD) //字段、枚举的常量

@Target(ElementType.METHOD) //方法

@Target(ElementType.PARAMETER) //方法参数

@Target(ElementType.CONSTRUCTOR) //构造函数

@Target(ElementType.LOCAL_VARIABLE)//局部变量

@Target(ElementType.ANNOTATION_TYPE)//注解

@Target(ElementType.PACKAGE) ///包  

 由以上的源码可以知道，他的elementType 可以有多个，一个注解可以为类的，方法的，字段的等等

 

@Document：说明该注解将被包含在javadoc中

 

@Inherited：说明子类可以继承父类中的该注解

 

比如@Valid注解定义是

![img](https://img-blog.csdn.net/20170527232327622?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYWNoZW55dWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)



表示该注解只能用在方法，属性，构造函数及方法参数上。该注意会被编译到class里可通过反射得到。

 



## .@RequestMapping

处理映射请求的注解。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。有6个属性。

### 1、 value， method:

value：指定请求的实际地址，指定的地址可以是URI Template 模式；

method：指定请求的method类型， GET、POST、PUT、DELETE等；

比如：

```java
@RequestMapping(value = "/testValid", method = RequestMethod.POST)
@ResponseBody
public Object testValid(@RequestBody @Valid Test test,BindingResult result, HttpServletRequest request, HttpServletResponse response) {
    XXX
}
```

value的uri值为以下三类：

A） 可以指定为普通的具体值；如@RequestMapping(value =”/testValid”)

B) 可以指定为含有某变量的一类值;如@RequestMapping(value=”/{day}”)

C) 可以指定为含正则表达式的一类值;如@RequestMapping(value=”/{textualPart:[a-z-]+}.{numericPart:[\\d]+}”) 可以匹配../chenyuan122912请求。

 

### 2、 consumes，produces：

consumes： 指定处理请求的提交内容类型（Content-Type），例如@RequestMapping(value = ”/test”, consumes=”application/json”)处理application/json内容类型

produces:  指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；

 

### 3 params、headers：

params： 指定request中必须包含某些参数值是，才让该方法处理。

例如：

```java
@RequestMapping(value = "/test", method = RequestMethod.GET, params="name=chenyuan")  
  public void findOrd(String name) {      
    // implementation omitted  
  }
```



仅处理请求中包含了名为“name”，值为“chenyuan”的请求.

 

headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。

```java
@RequestMapping(value = "/test", method = RequestMethod.GET, headers="Referer=www.baidu.com")  
  public void findOrd(String name) {      
    // implementation omitted  
  }
```

仅处理request的header中包含了指定“Refer”请求头和对应值为“www.baidu.com”的请求

另赠spring提供的注解：

![img](https://img-blog.csdn.net/20170527232331856?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYWNoZW55dWFu/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)



## @GetMapping和@PostMapping

 @GetMapping(value = “page”)等价于@RequestMapping(value = “page”, method = RequestMethod.GET)

 @PostMapping(value = “page”)等价于@RequestMapping(value = “page”, method = RequestMethod.POST)