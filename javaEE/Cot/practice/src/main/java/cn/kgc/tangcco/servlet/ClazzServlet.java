package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Clazz;
import cn.kgc.tangcco.service.ServiceClazzImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 15:29
 */
public class ClazzServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Clazz> clazzList = new ServiceClazzImpl().getClazzList();
        clazzList.forEach(clazz -> System.out.println(JSON.toJSONString(clazz)));

        req.setAttribute("clazzList",clazzList);
        req.getRequestDispatcher("clazzLogin.jsp").forward(req, resp);
    }
}
