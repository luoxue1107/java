package cn.kgc.tangcco.day14;


import cn.hutool.json.JSONObject;
;
import cn.hutool.json.JSONString;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 15:05
 */
public class Demo01Test {
    @Test
    public void test01(){

        Demo01 demo01 = new Demo01();
        String string = JSON.toJSONString(demo01);
        System.out.println(string);

    }

}
