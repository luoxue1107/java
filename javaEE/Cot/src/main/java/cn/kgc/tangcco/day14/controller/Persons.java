package cn.kgc.tangcco.day14.controller;

import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONObject;
import cn.kgc.tangcco.day14.pojo.Login;
import cn.kgc.tangcco.day14.pojo.Person;
import cn.kgc.tangcco.utils.servlet.BaseServlet;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 16:43
 */
@WebServlet(urlPatterns = "/persons")
public class  Persons extends BaseServlet {
  private static List<Person> persons= new ArrayList<Person>();
  static {
      ChineseNameGenerator name = ChineseNameGenerator.getInstance();
//      ChineseMobileNumberGenerator mobilenumber = ChineseMobileNumberGenerator.getInstance();
      GenericGenerator idcaerd = ChineseIDCardNumberGenerator.getInstance();
      for (int i = 0; i < 5; i++) {
          String firstname= name.generate();
          persons.add(new Person(i+1, IdUtil.fastSimpleUUID(), idcaerd.generate(), firstname,firstname));
      }
      persons.forEach(v -> System.out.println(JSON.toJSONString(v)));
  }

  public void loginPassword(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String mobile = request.getParameter("mobile");
    String password = request.getParameter("password");
    Login login = new Login(mobile,password,null);
    printObject(response,login);
      System.out.println("mobile"+mobile);
      System.out.println("password"+password);
  }
}
