package cn.kgc.tangcco.day02.optional;

import cn.kgc.tangcco.day02.dto.Emp;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Optional;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 20:29
 */
public class OptionalTest {
    @Test
    public void test01() {
        String str = "";
        if (str != null && !"".equals(str)) {
            System.out.println(str);
        } else {
            System.out.println("空");
        }
    }

    @Test
    public void test02() {
        String str = "";
        if (!StringUtils.isEmpty(str)) {
            System.out.println(str);
        } else {
            System.out.println("空");
        }
    }

    @Test
    public void test03() {
        String str = "李庆华001";
        // ofNullable 判空
        Optional<String> optional = Optional.ofNullable(str);
        //orElse 如果ofNillable 非空则将ofNullable参数返回
        String orElse = optional.orElse("李庆华002");
        System.out.println(orElse);
    }

    @Test
    public void test04() {
        String str = null;
        // ofNullable 判空
        Optional<String> optional = Optional.ofNullable(str);
        //orElse 如果ofNillable 非空则将ofNullable参数返回
        //orElse 如果ofNullable 为空则将 orElse 参数返回
        String orElse = optional.orElse("李庆华");
        System.out.println(orElse);
    }

    @Test
    public void test05() {
        // 获取账号
        String account = null;
        // 账号判空
        Optional<String> optionalAccou = Optional.ofNullable(account);
        //为空账号赋默认值
        account = optionalAccou.orElse("admin");
        //获取账号
        String password = null;
        // 账号判空
        Optional<String> optionalPassword = Optional.ofNullable(password);
        //为空账号赋默认值
        password = optionalPassword.orElse("123456");
        Emp emp = new Emp(account, password);
        System.out.println("账号：" + emp.getAccount() + "\n密码：" + emp.getPassword());
    }
}