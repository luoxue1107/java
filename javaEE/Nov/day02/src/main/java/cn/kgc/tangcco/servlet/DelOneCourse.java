package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DelOneCourse extends HttpServlet {
    private static final long serialVersionUID = 7402282217435842672L;

    private ServiceCourseImpl serviceCourse = new ServiceCourseImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");

        String id = req.getParameter("id");

        serviceCourse.delCourseById(Integer.parseInt(id));

        resp.sendRedirect("/all_courses");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
