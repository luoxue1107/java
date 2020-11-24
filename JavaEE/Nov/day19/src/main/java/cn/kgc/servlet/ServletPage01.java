package cn.kgc.servlet;

import cn.kgc.pojo.Department;
import cn.kgc.pojo.Page;
import cn.kgc.service.impl.DepartmentServiceImpl;
import cn.kgc.service.impl.PageServiceImpl;
import cn.kgc.util.Character;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 19:04
 */
@WebServlet(urlPatterns = "/page01")
public class ServletPage01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req, resp, "text/html");
        Map<String, Object> map = new HashMap<>();
        DepartmentServiceImpl department = new DepartmentServiceImpl();
        PageServiceImpl pageServiceImpl = new PageServiceImpl();
        List<Department> departments = department.getDepartmentList();
        Integer size = 5;
        String title = req.getParameter("title");
        String  page = req.getParameter("page");
        System.out.println(page);
        if (title == null) {
            title = "0";
        }
        if (page == null) {
            page = "1";
        }
        map.put("title", title);
        map.put("page", page);
        map.put("size", size);
        Page pages = pageServiceImpl.getPage(map);

        req.setAttribute("pages",pages);
        req.setAttribute("departments", departments);
        departments.forEach(department1 -> System.out.println(JSON.toJSONString(department1)));
        pages.getDoctor().forEach(doctor -> System.out.println(JSON.toJSONString(doctor)));
        req.setAttribute("doctor",pages.getDoctor());
        req.setAttribute("title",Integer.valueOf(title));

        req.getRequestDispatcher("page01.jsp").forward(req, resp);
    }
}
