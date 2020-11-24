package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Author;
import cn.kgc.tangcco.pojo.Page;
import cn.kgc.tangcco.service.Impl.ServiceAuthorImpl;
import cn.kgc.tangcco.service.Impl.ServicePageImpl;
import cn.kgc.tangcco.util.character.Character;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 14:54
 */
public class ServletLogin extends HttpServlet {

    private static final long serialVersionUID = -7802593609619399239L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req, resp, "text/html");
        ServicePageImpl pageImpl = new ServicePageImpl();
        ServiceAuthorImpl authorImpl = new ServiceAuthorImpl();
        Map<String, Object> map = new HashMap<>();

        List<Author> authorList = authorImpl.getAuthor();
        String page = req.getParameter("page");
        String title = req.getParameter("title");
        System.out.println(title);
        String initialTime = req.getParameter("initialTime");
        System.out.println(initialTime);
        String lastMinute = req.getParameter("lastMinute");
        System.out.println(lastMinute);
        map.put("title",title);
        map.put("initialTime",initialTime);
        map.put("lastMinute",lastMinute);
        map.put("size", 5);
        if (page == null) {
            System.out.println("page空");
            map.put("page", 1);
        } else {
            map.put("page",Integer.valueOf(page));
        }
        Page pages = pageImpl.getPage(map);
        pages.getJournalismList().forEach(journalism -> System.out.println(JSON.toJSONString(journalism)));
        System.out.println(JSON.toJSONString(pages));
        req.setAttribute("pages",pages);
        req.setAttribute("title",title);
        req.setAttribute("initialTime",initialTime);
        req.setAttribute("lastMinute",lastMinute);
        req.setAttribute("authorList", authorList);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
